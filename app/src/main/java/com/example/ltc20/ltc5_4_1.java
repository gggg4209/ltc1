package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc5_4_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc5_4_1);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter5_4_1 adapter = new ImageAdapter5_4_1(this);
        viewPager.setAdapter(adapter);
    }
}