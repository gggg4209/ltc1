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

public class roomltc12 extends AppCompatActivity {

    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomltc12);


        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("1111");
        arrayList.add("1112");
        arrayList.add("1113");
        arrayList.add("1114");
        arrayList.add("1115");
        arrayList.add("ห้องเรียนรู้ทฤษฎี");
        arrayList.add("ห้องพักครู ชั้น 1");
        // ชั้น 1
        arrayList.add("1121");
        arrayList.add("1122");
        arrayList.add("1123");
        arrayList.add("1124");
        arrayList.add("1125");
        arrayList.add("1126");
        arrayList.add("1127");
        arrayList.add("ห้องพักครู ชั้น 2");
        // ชั้น 2
        arrayList.add("1131");
        arrayList.add("1132");
        arrayList.add("1134");
        arrayList.add("1135");
        arrayList.add("1136");
        arrayList.add("1137");
        arrayList.add("ห้องพักครู ชั้น 3");
        // ชั้น 3







        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(roomltc12.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(roomltc12.this
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
        if (textView.getText().toString().equals("1111") ) {
            startActivity(new Intent(roomltc12.this,ltc12_1_1.class ));
        } else if (textView.getText().toString().equals("1112")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_2.class ));
        } else if (textView.getText().toString().equals("1113")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_3.class ));
        } else if (textView.getText().toString().equals("1114")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_4.class ));
        } else if (textView.getText().toString().equals("1115")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_5.class ));
        } else if (textView.getText().toString().equals("ห้องเรียนรู้ทฤษฎี")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_6.class ));
        } else if (textView.getText().toString().equals("ห้องพักครู ชั้น 1")) {
            startActivity(new Intent(roomltc12.this,ltc12_1_7.class ));
        ////// ชั้น 1

        } else if (textView.getText().toString().equals("1121")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_1.class ));
        } else if (textView.getText().toString().equals("1122")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_2.class ));
        } else if (textView.getText().toString().equals("1123")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_3.class ));
        } else if (textView.getText().toString().equals("1124")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_4.class ));
        } else if (textView.getText().toString().equals("1125")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_5.class ));
        } else if (textView.getText().toString().equals("1126")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_6.class ));
        } else if (textView.getText().toString().equals("1127")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_7.class ));
        } else if (textView.getText().toString().equals("ห้องพักครู ชั้น 2")) {
            startActivity(new Intent(roomltc12.this,ltc12_2_8.class ));
        ////// ชั้น 2

        } else if (textView.getText().toString().equals("1131")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_1.class ));
        } else if (textView.getText().toString().equals("1132")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_2.class ));
        } else if (textView.getText().toString().equals("1133")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_3.class ));
        } else if (textView.getText().toString().equals("1134")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_4.class ));
        } else if (textView.getText().toString().equals("1135")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_5.class ));
        } else if (textView.getText().toString().equals("1136")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_6.class ));
        } else if (textView.getText().toString().equals("1137")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_7.class ));
        } else if (textView.getText().toString().equals("ห้องพักครู ชั้น 3")) {
            startActivity(new Intent(roomltc12.this,ltc12_3_8.class ));
        }
        ////// ชั้น 3
        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
