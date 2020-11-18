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

public class room5 extends AppCompatActivity {
    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room5);
        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("511");
        arrayList.add("512");
        arrayList.add("513");
        arrayList.add("514");
        arrayList.add("515");


        arrayList.add("521");
        arrayList.add("522");
        arrayList.add("523");
        arrayList.add("524");
        arrayList.add("ห้องพักครูชั้น2");
        arrayList.add("ห้องพักอาคาร");

        arrayList.add("531");
        arrayList.add("532");
        arrayList.add("533");
        arrayList.add("534");
        arrayList.add("535");


        arrayList.add("541");
        arrayList.add("542");
        arrayList.add("543");
        arrayList.add("544");
        arrayList.add("545");












        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(room5.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(room5.this
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
        if (textView.getText().toString().equals("511") ) {
            startActivity(new Intent(room5.this,ltc5_1_2.class ));
        } else if (textView.getText().toString().equals("512")) {
            startActivity(new Intent(room5.this,ltc5_1_1.class ));
        } else if (textView.getText().toString().equals("513")) {
            startActivity(new Intent(room5.this,ltc5_1_3.class ));
        } else if (textView.getText().toString().equals("514")) {
            startActivity(new Intent(room5.this,ltc5_1_4.class ));
        } else if (textView.getText().toString().equals("515")) {
            startActivity(new Intent(room5.this,ltc5_1_5.class ));
        }

        else if (textView.getText().toString().equals("521")) {
            startActivity(new Intent(room5.this,ltc5_2_1.class ));
        } else if (textView.getText().toString().equals("522")) {
            startActivity(new Intent(room5.this,ltc5_2_2.class ));
        } else if (textView.getText().toString().equals("523")) {
            startActivity(new Intent(room5.this,ltc5_2_3.class ));
        } else if (textView.getText().toString().equals("524")) {
            startActivity(new Intent(room5.this,ltc5_2_4.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น2")) {
            startActivity(new Intent(room5.this,ltc5_2_5.class ));
        } else if (textView.getText().toString().equals("ห้องพักอาคาร")) {
            startActivity(new Intent(room5.this,ltc5_2_6.class ));
        }


        else if (textView.getText().toString().equals("531")) {
            startActivity(new Intent(room5.this,ltc5_3_1.class ));
        } else if (textView.getText().toString().equals("532")) {
            startActivity(new Intent(room5.this,ltc5_3_2.class ));
        } else if (textView.getText().toString().equals("533")) {
            startActivity(new Intent(room5.this,ltc5_3_3.class ));
        } else if (textView.getText().toString().equals("534")) {
            startActivity(new Intent(room5.this,ltc5_3_4.class ));
        } else if (textView.getText().toString().equals("535")) {
            startActivity(new Intent(room5.this,ltc5_3_5.class ));
        }


        else if (textView.getText().toString().equals("531")) {
            startActivity(new Intent(room5.this,ltc5_3_1.class ));
        } else if (textView.getText().toString().equals("532")) {
            startActivity(new Intent(room5.this,ltc5_3_2.class ));
        } else if (textView.getText().toString().equals("533")) {
            startActivity(new Intent(room5.this,ltc5_3_3.class ));
        } else if (textView.getText().toString().equals("534")) {
            startActivity(new Intent(room5.this,ltc5_3_4.class ));
        } else if (textView.getText().toString().equals("535")) {
            startActivity(new Intent(room5.this,ltc5_3_5.class ));
        }


        else if (textView.getText().toString().equals("541")) {
            startActivity(new Intent(room5.this,ltc5_4_1.class ));
        } else if (textView.getText().toString().equals("542")) {
            startActivity(new Intent(room5.this,ltc5_4_2.class ));
        } else if (textView.getText().toString().equals("543")) {
            startActivity(new Intent(room5.this,ltc5_4_3.class ));
        } else if (textView.getText().toString().equals("544")) {
            startActivity(new Intent(room5.this,ltc5_4_4.class ));
        } else if (textView.getText().toString().equals("545")) {
            startActivity(new Intent(room5.this,ltc5_4_5.class ));
        }





        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
