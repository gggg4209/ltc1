package com.example.ltc20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class room1 extends AppCompatActivity {

    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1);

        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("ห้องการเงิน");
        arrayList.add("ห้องงานทะเบียน");
        arrayList.add("ห้องประชาสัมพันธ์");
        arrayList.add("ห้องรองผู้อำนวยการ");
        arrayList.add("ห้องงานสารบัญ");
        arrayList.add("ห้องอำนวยการ");

        arrayList.add("ห้องอบรม");
        arrayList.add("ห้องฝ่ายแผนงาน");
        arrayList.add("ห้องกิจกรรม");
        arrayList.add("ห้องรองฝ่ายวิชาการ");
        arrayList.add("ห้องงานพัฒนานักเรียน");

        arrayList.add("ห้องงานกันคุณภาพและมาตรฐานนักศึกษา");
        arrayList.add("131");
        arrayList.add("132");
        arrayList.add("133");
        arrayList.add("134");

        arrayList.add("141");
        arrayList.add("ห้องพักครูชั้น4");
        arrayList.add("142");
        arrayList.add("143");
        arrayList.add("144");










        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(room1.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(room1.this
                        ,android.R.layout.simple_expandable_list_item_1,arrayList);

                listView.setAdapter(adapter);

                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        adapter.getFilter().filter(s);

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        textView.setText(adapter.getItem(position));
                        dialog.dismiss();
                    }
                });





            }
        });
        bt_go = findViewById(R.id.bt_go);
        bt_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();

            }
        });


    }
    public void Check() {
        if (textView.getText().toString().equals("ห้องการเงิน") ) {
            startActivity(new Intent(room1.this,ltc1_1_3.class ));
        } else if (textView.getText().toString().equals("ห้องงานทะเบียน")) {
            startActivity(new Intent(room1.this,ltc1_1_2.class ));
        } else if (textView.getText().toString().equals("ห้องประชาสัมพันธ์")) {
            startActivity(new Intent(room1.this,ltc1_1_1.class ));
        } else if (textView.getText().toString().equals("ห้องรองผู้อำนวยการ")) {
            startActivity(new Intent(room1.this,ltc1_1_4.class ));
        } else if (textView.getText().toString().equals("ห้องงานสารบัญ")) {
            startActivity(new Intent(room1.this,ltc1_1_5.class ));
        } else if (textView.getText().toString().equals("ห้องอำนวยการ")) {
            startActivity(new Intent(room1.this,ltc1_1_6.class ));
        } else if (textView.getText().toString().equals("ห้องอบรม")) {
            startActivity(new Intent(room1.this,ltc1_2_1.class ));
        } else if (textView.getText().toString().equals("ห้องฝ่ายแผนงาน")) {
            startActivity(new Intent(room1.this,ltc1_2_2.class ));
        } else if (textView.getText().toString().equals("ห้องกิจกรรม")) {
            startActivity(new Intent(room1.this,ltc1_2_3.class ));
        } else if (textView.getText().toString().equals("ห้องรองฝ่ายวิชาการ")) {
            startActivity(new Intent(room1.this,ltc1_2_4.class ));
        } else if (textView.getText().toString().equals("ห้องงานพัฒนานักเรียน")) {
            startActivity(new Intent(room1.this,ltc1_2_5.class ));
        }

        else if (textView.getText().toString().equals("ห้องงานกันคุณภาพและมาตรฐานนักศึกษา")) {
            startActivity(new Intent(room1.this,ltc1_3_1.class ));
        } else if (textView.getText().toString().equals("131")) {
            startActivity(new Intent(room1.this,ltc1_3_3.class ));
        } else if (textView.getText().toString().equals("132")) {
            startActivity(new Intent(room1.this,ltc1_3_2.class ));
        } else if (textView.getText().toString().equals("133")) {
            startActivity(new Intent(room1.this,ltc1_3_4.class ));
        } else if (textView.getText().toString().equals("134")) {
            startActivity(new Intent(room1.this,ltc1_3_5.class ));
        }

        else if (textView.getText().toString().equals("ห้องพักครูชั้น4")) {
            startActivity(new Intent(room1.this,ltc1_4_1.class ));
        } else if (textView.getText().toString().equals("141")) {
            startActivity(new Intent(room1.this,ltc1_4_3.class ));
        } else if (textView.getText().toString().equals("142")) {
            startActivity(new Intent(room1.this,ltc1_4_2.class ));
        } else if (textView.getText().toString().equals("143")) {
            startActivity(new Intent(room1.this,ltc1_4_4.class ));
        } else if (textView.getText().toString().equals("144")) {
            startActivity(new Intent(room1.this,ltc1_4_5.class ));
        }



        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}



