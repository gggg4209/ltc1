package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc4_2_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc4_2_4);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterltc4_2_4 adapter = new ImageAdapterltc4_2_4(this);
        viewPager.setAdapter(adapter);
    }
}