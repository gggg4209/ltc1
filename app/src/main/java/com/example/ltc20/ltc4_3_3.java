package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc4_3_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc4_3_3);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterltc4_3_3 adapter = new ImageAdapterltc4_3_3(this);
        viewPager.setAdapter(adapter);
    }
}