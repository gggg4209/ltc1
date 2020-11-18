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

public class roomltc4 extends AppCompatActivity {

    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomltc4);


        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("411");
        arrayList.add("412");
        arrayList.add("414");
        arrayList.add("ห้องชมรม ชั้น 1");

        // ฃั้น 1
        arrayList.add("422");
        arrayList.add("423");
        arrayList.add("424");
        arrayList.add("ห้องพักครู ชั้น 2");
        // ฃั้น 2
        arrayList.add("431");
        arrayList.add("432");
        arrayList.add("433");
        arrayList.add("434");
        // ฃั้น 3







        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(roomltc4.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(roomltc4.this
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
        if (textView.getText().toString().equals("411") ) {
            startActivity(new Intent(roomltc4.this,ltc4_1_1.class ));
        } else if (textView.getText().toString().equals("412")) {
            startActivity(new Intent(roomltc4.this,ltc4_1_2.class ));
        } else if (textView.getText().toString().equals("414")) {
            startActivity(new Intent(roomltc4.this,ltc4_1_3.class ));
        } else if (textView.getText().toString().equals("ห้องชมรม ชั้น 1")) {
            startActivity(new Intent(roomltc4.this,ltc4_1_4.class ));
            // ฃั้น 1

            } else if (textView.getText().toString().equals("422")) {
            startActivity(new Intent(roomltc4.this,ltc4_2_1.class ));
        } else if (textView.getText().toString().equals("423")) {
            startActivity(new Intent(roomltc4.this,ltc4_2_2.class ));
        } else if (textView.getText().toString().equals("424")) {
            startActivity(new Intent(roomltc4.this,ltc4_2_3.class ));
        } else if (textView.getText().toString().equals("ห้องพักครู ชั้น 2")) {
            startActivity(new Intent(roomltc4.this,ltc4_2_4.class ));
            // ฃั้น 2

        } else if (textView.getText().toString().equals("431")) {
            startActivity(new Intent(roomltc4.this,ltc4_3_1.class ));
        } else if (textView.getText().toString().equals("432")) {
            startActivity(new Intent(roomltc4.this,ltc4_3_2.class ));
        } else if (textView.getText().toString().equals("433")) {
            startActivity(new Intent(roomltc4.this,ltc4_3_3.class ));
        } else if (textView.getText().toString().equals("434")) {
            startActivity(new Intent(roomltc4.this,ltc4_3_4.class ));
        }
        // ฃั้น 3
        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
