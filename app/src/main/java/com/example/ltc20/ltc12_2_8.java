package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc12_2_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc12_2_8);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter12_2_8 adapter = new ImageAdapter12_2_8(this);
        viewPager.setAdapter(adapter);
    }
}