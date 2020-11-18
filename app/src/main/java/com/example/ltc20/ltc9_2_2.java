package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc9_2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc9_2_2);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter9_2_2 adapter = new ImageAdapter9_2_2(this);
        viewPager.setAdapter(adapter);
    }
}