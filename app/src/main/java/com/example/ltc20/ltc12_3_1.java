package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc12_3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc12_3_1);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter12_3_1 adapter = new ImageAdapter12_3_1(this);
        viewPager.setAdapter(adapter);
    }
}