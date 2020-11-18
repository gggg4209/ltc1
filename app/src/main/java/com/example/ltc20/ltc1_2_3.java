package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc1_2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc1_2_3);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter1_2_3 adapter = new ImageAdapter1_2_3(this);
        viewPager.setAdapter(adapter);
    }
}