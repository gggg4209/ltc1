package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark4 extends AppCompatActivity {
    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark4);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.lt4);

        photoView = (PhotoView) findViewById(R.id.photo_view1);
        photoView.setImageResource(R.drawable.ltc4);

        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.lt44);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.lt444);

        photoView = (PhotoView) findViewById(R.id.photo_view4);
        photoView.setImageResource(R.drawable.lt4444);
    }
}