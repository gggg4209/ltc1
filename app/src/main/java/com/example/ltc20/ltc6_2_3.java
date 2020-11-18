package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc6_2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc6_2_3);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter6_2_3 adapter = new ImageAdapter6_2_3(this);
        viewPager.setAdapter(adapter);
    }
}