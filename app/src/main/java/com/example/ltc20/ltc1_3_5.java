package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc1_3_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc1_3_5);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter1_3_5 adapter = new ImageAdapter1_3_5 (this);
        viewPager.setAdapter(adapter);
    }
}