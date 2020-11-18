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

public class roomltc8 extends AppCompatActivity {
    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomltc8);

        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("811");
        arrayList.add("812");
        arrayList.add("821");
        arrayList.add("831");
        arrayList.add("832");
        arrayList.add("833");
        arrayList.add("834");
        arrayList.add("835");
        arrayList.add("836");
        arrayList.add("837");
        arrayList.add("838");
        arrayList.add("841");
        arrayList.add("ห้องพักครูชั้น1");
        arrayList.add("ห้องพักครูชั้น2");
        arrayList.add("ห้องพักครูชั้น4ห้องที่2");
        arrayList.add("ห้องพักครูชั้น4ห้องที่1");
        arrayList.add("ห้องทดลองชั้น2");







        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(roomltc8.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(roomltc8.this
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
        if (textView.getText().toString().equals("811") ) {
            startActivity(new Intent(roomltc8.this,ltc8_1_1.class ));
        } else if (textView.getText().toString().equals("812")) {
            startActivity(new Intent(roomltc8.this,ltc8_1_2.class ));
        } else if (textView.getText().toString().equals("821")) {
            startActivity(new Intent(roomltc8.this,ltc8_2_1.class ));
        } else if (textView.getText().toString().equals("831")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_1.class ));
        } else if (textView.getText().toString().equals("832")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_2.class ));
        } else if (textView.getText().toString().equals("833")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_3.class ));
        } else if (textView.getText().toString().equals("834")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_4.class ));
        } else if (textView.getText().toString().equals("835")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_5.class ));
        } else if (textView.getText().toString().equals("836")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_6.class ));
        } else if (textView.getText().toString().equals("837")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_7.class ));
        } else if (textView.getText().toString().equals("838")) {
            startActivity(new Intent(roomltc8.this,ltc8_3_8.class ));
        } else if (textView.getText().toString().equals("841")) {
            startActivity(new Intent(roomltc8.this,ltc8_4_1.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น1")) {
            startActivity(new Intent(roomltc8.this,ltc8_1_3.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น2")) {
            startActivity(new Intent(roomltc8.this,ltc8_2_2.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น4ห้องที่1")) {
            startActivity(new Intent(roomltc8.this,ltc8_4_2.class ));
        } else if (textView.getText().toString().equals("ห้องพักครูชั้น4ห้องที่2")) {
            startActivity(new Intent(roomltc8.this,ltc8_4_3.class ));
        } else if (textView.getText().toString().equals("ห้องทดลองชั้น2")) {
            startActivity(new Intent(roomltc8.this,ltc8_2_3.class ));
        }
        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
