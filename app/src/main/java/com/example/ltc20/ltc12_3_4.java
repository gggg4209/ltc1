package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc12_3_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc12_3_4);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter12_3_4 adapter = new ImageAdapter12_3_4(this);
        viewPager.setAdapter(adapter);
    }
}