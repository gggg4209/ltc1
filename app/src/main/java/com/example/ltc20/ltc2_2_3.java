package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ltc2_2_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltc2_2_3);

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterltc2_2_3 adapter = new ImageAdapterltc2_2_3(this);
        viewPager.setAdapter(adapter);
    }
}