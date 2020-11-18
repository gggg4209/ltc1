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

public class room13 extends AppCompatActivity {
    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room13);
        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("ห้องพักครูชั้น1ห้อง1");
        arrayList.add("LAP1");
        arrayList.add("LAP2");
        arrayList.add("ห้องเก็บของชั้น1");
        arrayList.add("ห้องพักครูชั้น1ห้อง2");


        arrayList.add("ห้องสมุด");
        arrayList.add("ห้องเก็บของชั้น2ห้อง1");
        arrayList.add("ห้องเก็บของชั้น2ห้อง2");
        arrayList.add("ห้องเครื่องมือสำรวจ");
        arrayList.add("202");
        arrayList.add("201");
        arrayList.add("204");
        arrayList.add("203");
        arrayList.add("205");




        arrayList.add("ห้องพักครูชั้น3");
        arrayList.add("305");
        arrayList.add("ห้องเก็บของชั้น3ห้อง1");
        arrayList.add("ห้องเก็บของชั้น3ห้อง2");
        arrayList.add("301");
        arrayList.add("302");
        arrayList.add("303");
        arrayList.add("304");
        arrayList.add("306");



        arrayList.add("ห้องเก็บของชั้น4");
        arrayList.add("ห้องช่างยนต์ยืมใช้ชั่วคราว");





        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(room13.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(room13.this
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
        if (textView.getText().toString().equals("ห้องพักครูชั้น1ห้อง1") ) {
            startActivity(new Intent(room13.this,ltc13_1_1.class ));
        } else if (textView.getText().toString().equals("LAP1")) {
            startActivity(new Intent(room13.this,ltc13_1_2.class ));
        } else if (textView.getText().toString().equals("LAP2")) {
            startActivity(new Intent(room13.this,ltc13_1_3.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น1ห้อง2")) {
            startActivity(new Intent(room13.this,ltc13_1_4.class ));
        } else if (textView.getText().toString().equals("ห้องเก็บของชั้น1")) {
            startActivity(new Intent(room13.this,ltc13_1_5.class ));
        }


        else if (textView.getText().toString().equals("ห้องสมุด")) {
            startActivity(new Intent(room13.this,ltc13_2_1.class ));
        } else if (textView.getText().toString().equals("ห้องเก็บของชั้น2ห้อง1")) {
            startActivity(new Intent(room13.this,ltc13_2_2.class ));
        } else if (textView.getText().toString().equals("ห้องเก็บของชั้น2ห้อง2")) {
            startActivity(new Intent(room13.this,ltc13_2_3.class ));
        } else if (textView.getText().toString().equals("ห้องเครื่องมือสำรวจ")) {
            startActivity(new Intent(room13.this,ltc13_2_4.class ));
        }else if (textView.getText().toString().equals("202")) {
            startActivity(new Intent(room13.this,ltc13_2_5.class ));
        } else if (textView.getText().toString().equals("201")) {
            startActivity(new Intent(room13.this,ltc13_2_6.class ));
        } else if (textView.getText().toString().equals("204")) {
            startActivity(new Intent(room13.this,ltc13_2_7.class ));
        } else if (textView.getText().toString().equals("203")) {
            startActivity(new Intent(room13.this,ltc13_2_8.class ));
        }else if (textView.getText().toString().equals("205")) {
            startActivity(new Intent(room13.this,ltc13_2_9.class ));
        }


        else if (textView.getText().toString().equals("ห้องพักครูชั้น3")) {
            startActivity(new Intent(room13.this,ltc13_3_1.class ));
        } else if (textView.getText().toString().equals("305")) {
            startActivity(new Intent(room13.this,ltc13_3_2.class ));
        } else if (textView.getText().toString().equals("ห้องเก็บของชั้น3ห้อง2")) {
            startActivity(new Intent(room13.this,ltc13_3_3.class ));
        } else if (textView.getText().toString().equals("ห้องเก็บของชั้น3ห้อง1")) {
            startActivity(new Intent(room13.this,ltc13_3_4.class ));
        }else if (textView.getText().toString().equals("301")) {
            startActivity(new Intent(room13.this,ltc13_3_5.class ));
        } else if (textView.getText().toString().equals("302")) {
            startActivity(new Intent(room13.this,ltc13_3_6.class ));
        } else if (textView.getText().toString().equals("303")) {
            startActivity(new Intent(room13.this,ltc13_3_7.class ));
        } else if (textView.getText().toString().equals("304")) {
            startActivity(new Intent(room13.this,ltc13_3_8.class ));
        }else if (textView.getText().toString().equals("306")) {
            startActivity(new Intent(room13.this,ltc13_3_9.class ));
        }



        else if (textView.getText().toString().equals("ห้องเก็บของชั้น4")) {
            startActivity(new Intent(room13.this,ltc13_4_1.class ));
        } else if (textView.getText().toString().equals("ห้องช่างยนต์ยืมใช้ชั่วคราว")) {
            startActivity(new Intent(room13.this,ltc13_4_2.class ));
        }






        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
