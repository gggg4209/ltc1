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

public class roomltc6 extends AppCompatActivity {

    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomltc6);


        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();

        arrayList.add("611");
        arrayList.add("612");
        arrayList.add("613");
        arrayList.add("614");
        arrayList.add("615");
        arrayList.add("621");
        arrayList.add("622");
        arrayList.add("623");
        arrayList.add("624");
        arrayList.add("625");
        arrayList.add("631");
        arrayList.add("632");
        arrayList.add("633");
        arrayList.add("634");
        arrayList.add("635");
        arrayList.add("641");
        arrayList.add("642");
        arrayList.add("643");
        arrayList.add("644");
        arrayList.add("647");







        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(roomltc6.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(roomltc6.this
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
        if (textView.getText().toString().equals("611") ) {
            startActivity(new Intent(roomltc6.this,ltc6_1_1.class ));
        } else if (textView.getText().toString().equals("612")) {
            startActivity(new Intent(roomltc6.this,ltc6_1_2.class ));
        } else if (textView.getText().toString().equals("613")) {
            startActivity(new Intent(roomltc6.this,ltc6_1_3.class ));
        } else if (textView.getText().toString().equals("614")) {
            startActivity(new Intent(roomltc6.this,ltc6_1_4.class ));
        } else if (textView.getText().toString().equals("615")) {
            startActivity(new Intent(roomltc6.this,ltc6_1_5.class ));
        } else if (textView.getText().toString().equals("621")) {
            startActivity(new Intent(roomltc6.this,ltc6_2_1.class ));
        } else if (textView.getText().toString().equals("622")) {
            startActivity(new Intent(roomltc6.this,ltc6_2_2.class ));
        } else if (textView.getText().toString().equals("623")) {
            startActivity(new Intent(roomltc6.this,ltc6_2_3.class ));
        } else if (textView.getText().toString().equals("624")) {
            startActivity(new Intent(roomltc6.this,ltc6_2_4.class ));
        } else if (textView.getText().toString().equals("625")) {
            startActivity(new Intent(roomltc6.this,ltc6_2_5.class ));
        } else if (textView.getText().toString().equals("631")) {
            startActivity(new Intent(roomltc6.this,ltc6_3_1.class ));
        } else if (textView.getText().toString().equals("632")) {
            startActivity(new Intent(roomltc6.this,ltc6_3_2.class ));
        } else if (textView.getText().toString().equals("633")) {
            startActivity(new Intent(roomltc6.this,ltc6_3_3.class ));
        } else if (textView.getText().toString().equals("634")) {
            startActivity(new Intent(roomltc6.this,ltc6_3_4.class ));
        } else if (textView.getText().toString().equals("635")) {
            startActivity(new Intent(roomltc6.this,ltc6_3_5.class ));
        } else if (textView.getText().toString().equals("641")) {
            startActivity(new Intent(roomltc6.this,ltc6_4_1.class ));
        } else if (textView.getText().toString().equals("642")) {
            startActivity(new Intent(roomltc6.this,ltc6_4_2.class ));
        } else if (textView.getText().toString().equals("643")) {
            startActivity(new Intent(roomltc6.this,ltc6_4_3.class ));
        } else if (textView.getText().toString().equals("644")) {
            startActivity(new Intent(roomltc6.this,ltc6_4_4.class ));
        } else if (textView.getText().toString().equals("647")) {
            startActivity(new Intent(roomltc6.this,ltc6_4_5.class ));
        }
        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}
