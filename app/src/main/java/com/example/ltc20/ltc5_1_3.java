package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc5_1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc5_1_3);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter5_1_3 adapter = new ImageAdapter5_1_3(this);
        viewPager.setAdapter(adapter);
    }
}