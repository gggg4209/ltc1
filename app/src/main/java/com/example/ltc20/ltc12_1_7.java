package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc12_1_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc12_1_7);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter12_1_7 adapter = new ImageAdapter12_1_7(this);
        viewPager.setAdapter(adapter);
    }
}