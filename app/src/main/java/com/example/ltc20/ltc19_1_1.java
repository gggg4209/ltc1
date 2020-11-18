package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc19_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc19_1_1);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter19_1_1 adapter = new ImageAdapter19_1_1(this);
        viewPager.setAdapter(adapter);
    }
}