package com.example.it_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_detail_activity);

        Intent intentView = getIntent();
        String url = intentView.getStringExtra("urlCourse");

        WebView webViewCourse = (WebView) findViewById(R.id.webViewCourse);
        webViewCourse.loadUrl(url);
        webViewCourse.setWebViewClient(new WebViewClient());
        webViewCourse.getSettings().setJavaScriptEnabled(true);
    }

    public void onClickBtnBack(View v) {
        finish();
    }
}