package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark22 extends AppCompatActivity {
    PhotoView photoView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark22);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.olt22);



        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.oltc22);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.oltc222);


    }
}