package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc7_2_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc7_2_5);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter7_2_5 adapter = new ImageAdapter7_2_5(this);
        viewPager.setAdapter(adapter);
    }
}