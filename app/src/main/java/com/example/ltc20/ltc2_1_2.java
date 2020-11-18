package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc2_1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc2_1_2);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter01 adapter = new ImageAdapter01(this);
        viewPager.setAdapter(adapter);
    }
}