package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activityshowdetail12 extends AppCompatActivity {

    Button bt_map, bt_landmark,bt_room ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityshowdetail12);

        bt_map = findViewById(R.id.bt_map);
        bt_landmark = findViewById(R.id.bt_landmark);
        bt_room = findViewById(R.id.bt_room);

        bt_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activityshowdetail12.this, roomltc12.class);// หน้าที่กดไป
                startActivity(i);

            }
        });


        bt_landmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activityshowdetail12.this ,landmark12.class);// หน้าที่กดไป
                startActivity(i);


            }
        });

        bt_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lat = "18.574586" ;  // ละติจูดสมมุติ
                String lng = "98.998346" ;



                String strUri = "http://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "Label which you want" + ")";
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("google.navigation:q="+lat +","+lng));

                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                startActivity(intent);


            }
        });
    }
}