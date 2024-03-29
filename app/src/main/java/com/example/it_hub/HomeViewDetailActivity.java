package com.example.it_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeViewDetailActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_view_detail_activity);
        Intent intentView = getIntent();

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        TextView titleActivity = findViewById(R.id.titleActivity);
        titleActivity.setText(intentView.getStringExtra("titleActivity"));

        TextView contentTitle = findViewById(R.id.contentTitle);
        TextView contentDescription = findViewById(R.id.contentDescription);
        ImageView contentImage = findViewById(R.id.contentImage);


        contentTitle.setText(intentView.getStringExtra("contentTitle"));
        contentDescription.setText(intentView.getStringExtra("contentDescription"));
        contentImage.setImageResource(intentView.getIntExtra("contenImage", R.drawable.logo_it_white));

    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btnBack) {
            finish();
        }
    }
}