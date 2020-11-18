package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark8 extends AppCompatActivity {
    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark8);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.lt8);


        photoView = (PhotoView) findViewById(R.id.photo_view1);
        photoView.setImageResource(R.drawable.ltc8);

        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.lt88);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.lt888);

        photoView = (PhotoView) findViewById(R.id.photo_view4);
        photoView.setImageResource(R.drawable.lt8888);

        photoView = (PhotoView) findViewById(R.id.photo_view5);
        photoView.setImageResource(R.drawable.lt88888);


    }
}