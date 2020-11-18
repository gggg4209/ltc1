package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark3 extends AppCompatActivity {

    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark3);
        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.lt3);

        photoView = (PhotoView) findViewById(R.id.photo_view1);
        photoView.setImageResource(R.drawable.ltc3);

        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.ltc33);

    }
}