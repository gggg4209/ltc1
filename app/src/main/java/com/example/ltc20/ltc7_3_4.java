package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc7_3_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc7_3_4);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter7_3_4 adapter = new ImageAdapter7_3_4(this);
        viewPager.setAdapter(adapter);
    }
}