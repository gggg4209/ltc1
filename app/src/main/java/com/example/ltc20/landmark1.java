package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.gesture.GestureLibraries;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;

import com.github.chrisbanes.photoview.PhotoView;

public class landmark1 extends AppCompatActivity {
    PhotoView photoView  ;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmark1);

        photoView = (PhotoView) findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.lt1);



        photoView = (PhotoView) findViewById(R.id.photo_view2);
        photoView.setImageResource(R.drawable.ltc1);

        photoView = (PhotoView) findViewById(R.id.photo_view3);
        photoView.setImageResource(R.drawable.lt11);

        photoView = (PhotoView) findViewById(R.id.photo_view4);
        photoView.setImageResource(R.drawable.lt111);

        photoView = (PhotoView) findViewById(R.id.photo_view5);
        photoView.setImageResource(R.drawable.lt1111);

        photoView = (PhotoView) findViewById(R.id.photo_view6);
        photoView.setImageResource(R.drawable.lt1111);












    }
    }
