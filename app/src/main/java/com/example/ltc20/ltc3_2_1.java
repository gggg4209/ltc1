package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc3_2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc3_2_1);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter3_2_1 adapter = new ImageAdapter3_2_1(this);
        viewPager.setAdapter(adapter);
    }
}