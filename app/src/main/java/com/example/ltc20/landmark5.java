package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark5 extends AppCompatActivity {
    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark5);
        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.lt5);

        photoView = (PhotoView) findViewById(R.id.photo_view1);
        photoView.setImageResource(R.drawable.ltc5);

        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.ltc555);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.ltc5555);

        photoView = (PhotoView) findViewById(R.id.photo_view4);
        photoView.setImageResource(R.drawable.ltc55555);
        photoView = (PhotoView) findViewById(R.id.photo_view5);
        photoView.setImageResource(R.drawable.ltc555555);
    }
}