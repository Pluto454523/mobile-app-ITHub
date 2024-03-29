package com.example.it_hub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HomeListViewActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private ListView listView;

    private String[] contenDescriptions, contentTitles;

    private int[] contenImages;;

    private String titleActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_list_view_activity);
        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        Intent intentView = getIntent();

        contentTitles = intentView.getStringArrayExtra("contentTitles");
        contenDescriptions = intentView.getStringArrayExtra("contentDescriptions");
        contenImages = intentView.getIntArrayExtra("contentImages");
        titleActivity = intentView.getStringExtra("titleActivity");

        TextView textViewTitleActivity = findViewById(R.id.titleActivity);
        textViewTitleActivity.setText(titleActivity);

        CustomListViewAdapter adapter = new CustomListViewAdapter(this, contentTitles, contenDescriptions, contenImages);
        listView = (ListView) findViewById(R.id.listNews);
        listView.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btnBack) {
            finish();
        }
    }

    public void startDetailActivity(int position) {
        Intent intentView = new Intent(HomeListViewActivity.this, HomeViewDetailActivity.class);
        intentView.putExtra("titleActivity", titleActivity);
        intentView.putExtra("contentTitle", contentTitles[position]);
        intentView.putExtra("contentDescription", contenDescriptions[position]);
        intentView.putExtra("contenImage", contenImages[position]);
        startActivity(intentView);
    }

}

class CustomListViewAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] contentDescription;
    private final String[] contentTitle;
    private final int[] contentImages;
    public CustomListViewAdapter(Context ctx, String[] contentTitle, String[] contentDescription, int[] contentImages) {
        super(ctx, R.layout.home_view_layout, contentTitle);
        this.context = ctx;
        this.contentTitle = contentTitle;
        this.contentDescription = contentDescription;
        this.contentImages = contentImages;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.home_view_layout, null, true);

        TextView textTitle = (TextView) rowView.findViewById(R.id.textTitle);
        textTitle.setText(contentTitle[position]);

        TextView linkCourse = (TextView) rowView.findViewById(R.id.linkCourse);
        linkCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((HomeListViewActivity) context).startDetailActivity(position);
            }
        });

        ImageView imgView = (ImageView) rowView.findViewById(R.id.imgView);
        imgView.setImageResource(contentImages[position]);

        return rowView;
    }
}