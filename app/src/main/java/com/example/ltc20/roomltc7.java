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

public class roomltc7 extends AppCompatActivity {

    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomltc7);


        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("711");
        arrayList.add("712");
        arrayList.add("713");
        arrayList.add("714");
        arrayList.add("715");
        arrayList.add("721");
        arrayList.add("722");
        arrayList.add("723");
        arrayList.add("724");
        arrayList.add("725");
        arrayList.add("731");
        arrayList.add("732");
        arrayList.add("733");
        arrayList.add("735");







        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(roomltc7.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(roomltc7.this
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
        if (textView.getText().toString().equals("711") ) {
            startActivity(new Intent(roomltc7.this,ltc7_1_1.class ));
        } else if (textView.getText().toString().equals("712")) {
            startActivity(new Intent(roomltc7.this,ltc7_1_2.class ));
        } else if (textView.getText().toString().equals("713")) {
            startActivity(new Intent(roomltc7.this,ltc7_1_3.class ));
        } else if (textView.getText().toString().equals("714")) {
            startActivity(new Intent(roomltc7.this,ltc7_1_4.class ));
        } else if (textView.getText().toString().equals("715")) {
            startActivity(new Intent(roomltc7.this,ltc7_1_5.class ));
        } else if (textView.getText().toString().equals("721")) {
            startActivity(new Intent(roomltc7.this,ltc7_2_1.class ));
        } else if (textView.getText().toString().equals("722")) {
            startActivity(new Intent(roomltc7.this,ltc7_2_2.class ));
        } else if (textView.getText().toString().equals("723")) {
            startActivity(new Intent(roomltc7.this,ltc7_2_3.class ));
        } else if (textView.getText().toString().equals("724")) {
            startActivity(new Intent(roomltc7.this,ltc7_2_4.class ));
        } else if (textView.getText().toString().equals("725")) {
            startActivity(new Intent(roomltc7.this,ltc7_2_5.class ));
        } else if (textView.getText().toString().equals("731")) {
            startActivity(new Intent(roomltc7.this,ltc7_3_1.class ));
        } else if (textView.getText().toString().equals("732")) {
            startActivity(new Intent(roomltc7.this,ltc7_3_2.class ));
        } else if (textView.getText().toString().equals("733")) {
            startActivity(new Intent(roomltc7.this,ltc7_3_3.class ));
        } else if (textView.getText().toString().equals("735")) {
            startActivity(new Intent(roomltc7.this,ltc7_3_4.class ));
        }
        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
