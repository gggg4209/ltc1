package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark12 extends AppCompatActivity {
    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark12);


        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.olt12);

        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.oltc12);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.oltc122);
    }
    }
