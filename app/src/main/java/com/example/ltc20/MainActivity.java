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

public class MainActivity extends AppCompatActivity {
    TextView textView ;
    ArrayList<String> arrayList ;
    Dialog dialog ;
    Button bt_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        bt_go = findViewById(R.id.bt_go);


        arrayList = new ArrayList<>();



        arrayList.add("อาคารอำนวยการ วิทยาลัยเทคนิคลำพูน");
        arrayList.add("อาคารสำนักงานฝ่ายพัฒนาฯ");
        arrayList.add("แผนกคอมพิวเตอร์กลาง");
        arrayList.add("แผนกคหกรรมศาสตร์");
        arrayList.add("แผนกวิชาช่างไฟฟ้า");
        arrayList.add("อาคารพาณิชยกรรม");
        arrayList.add("แผนกสามัญ-สัมพันธ์");
        arrayList.add("แผนกอุตสาหกรรม (ช่างกล, ช่างเชื่อม, เทคนิคพื้นฐาน)");
        arrayList.add("แผนกคอมพิวเตอร์ธุระกิจ");
        arrayList.add("แผนกวิชาโลจิสติกส์");
        arrayList.add("อาคารศูนย์วิทยการ");
        arrayList.add("แผนกวิชาอิเล็กทรอนิกส์");
        arrayList.add("แผนกก่อสร้าง-โยธา");
        arrayList.add("แผนกช่างยนต์");
        arrayList.add("อาคารพัสดุกลาง");
        arrayList.add("อาคารสถานี");
        arrayList.add("แผนกเทคนิคการผลิต");
        arrayList.add("อาคารปฏิบัติการติดตั้งไฟฟ้า");
        arrayList.add("อาคารฝึกติดตั้งระบบปรับอากาศ(ไฟฟ้า)");
        arrayList.add("อาคารเฉลิมพระเกียรติ-โรงอาหาร");
        arrayList.add("อาคารอเนกประสงค์");
        arrayList.add("อาคารห้องเกียรติยศ");
        arrayList.add("แผนกแมคคาทรอนิกส์");
        arrayList.add("แผนกการตลาด");

        arrayList.add("ห้องการเงิน");
        arrayList.add("ห้องทะเบียน");
        arrayList.add("ห้องประชาสัมพันธ์");
        arrayList.add("ห้องรองผู้อำนวยการ");
        arrayList.add("ห้องอบรม");
        arrayList.add("ห้องฝ่ายแผนงาน");
        arrayList.add("ห้องกิจกรรม");
        arrayList.add("ห้องรองฝ่ายวิชาการ");
        arrayList.add("ห้องงานพัฒนานักเรียน");
        arrayList.add("ห้องประกันคุณภาพและมาตราฐานนักศึกษา");
        arrayList.add("131");
        arrayList.add("132");
        arrayList.add("133");
        arrayList.add("134");
        arrayList.add("141");
        arrayList.add("142");
        arrayList.add("143");
        arrayList.add("144");


        arrayList.add("ห้องพยาบาล");
        arrayList.add("ห้องแนะแนว");
        arrayList.add("ห้องงานกิจกรรม");






        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_scarchable_spinner);
                dialog.getWindow() .setLayout(650,900);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                EditText editText = dialog.findViewById(R.id.edit_text);
                ListView listView = dialog.findViewById(R.id.list_view);
                final ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this
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
        if (textView.getText().toString().equals("อาคารอำนวยการ วิทยาลัยเทคนิคลำพูน")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail1.class ));

        } else if (textView.getText().toString().equals("อาคารสำนักงานฝ่ายพัฒนาฯ")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail2.class ));
        } else if (textView.getText().toString().equals("แผนกคอมพิวเตอร์กลาง")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail3.class ));
        } else if (textView.getText().toString().equals("แผนกคหกรรมศาสตร์")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail4.class ));    //หายยยยยยยยยยยยยยยยยยยยยย 1 ตึกกกก
        } else if (textView.getText().toString().equals("แผนกวิชาช่างไฟฟ้า")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail5.class ));
        } else if (textView.getText().toString().equals("อาคารพาณิชยกรรม")) {  //แผนกการตลาด
            startActivity(new Intent(MainActivity.this,Activityshowdetail6.class ));
        }   else if (textView.getText().toString().equals("แผนกการตลาด")) {  //แผนกการตลาด
                startActivity(new Intent(MainActivity.this,Activityshowdetail6.class ));
        } else if (textView.getText().toString().equals("แผนกสามัญ-สัมพันธ์")) {
            startActivity(new Intent(MainActivity.this, Activityshowdetail7.class));
        }else if (textView.getText().toString().equals("แผนกอุตสาหกรรม (ช่างกล, ช่างเชื่อม, เทคนิคพื้นฐาน)")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail8.class ));
        } else if (textView.getText().toString().equals("แผนกคอมพิวเตอร์ธุระกิจ")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail9.class ));
        } else if (textView.getText().toString().equals("แผนกวิชาโลจิสติกส์")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail10.class ));
        } else if (textView.getText().toString().equals("อาคารศูนย์วิทยการ")) {    //แผนกแมคคาทรอนิกส์
            startActivity(new Intent(MainActivity.this, Activityshowdetail11.class));
        } else if (textView.getText().toString().equals("แผนกแมคคาทรอนิกส์")) {    //แผนกแมคคาทรอนิกส์
            startActivity(new Intent(MainActivity.this, Activityshowdetail11.class));
        } else if (textView.getText().toString().equals("แผนกวิชาอิเล็กทรอนิกส์")) {
            startActivity(new Intent(MainActivity.this, Activityshowdetail12.class));
        } else if (textView.getText().toString().equals("แผนกก่อสร้าง-โยธา")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail13.class ));
        } else if (textView.getText().toString().equals("แผนกช่างยนต์")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail14.class ));
        } else if (textView.getText().toString().equals("อาคารพัสดุกลาง")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail15.class ));
        } else if (textView.getText().toString().equals("อาคารสถานี")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail16.class ));
        } else if (textView.getText().toString().equals("แผนกเทคนิคการผลิต")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail17.class ));
        } else if (textView.getText().toString().equals("อาคารปฏิบัติการติดตั้งไฟฟ้า")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail18.class ));
        } else if (textView.getText().toString().equals("อาคารฝึกติดตั้งระบบปรับอากาศ(ไฟฟ้า)")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail19.class ));
        } else if (textView.getText().toString().equals("อาคารเฉลิมพระเกียรติ-โรงอาหาร")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail20.class ));  //        arrayList.add("อาคารฝึกติดตั้งระบบปรับอากาศ(ไฟฟ้า)");
        } else if (textView.getText().toString().equals("อาคารอเนกประสงค์")) {
            startActivity(new Intent(MainActivity.this, Activityshowdetail21.class));  //        arrayList.add("อาคารเฉลิมพระเกียรติ-โรงอาหาร");
        }  else if (textView.getText().toString().equals("อาคารห้องเกียรติยศ")) {
            startActivity(new Intent(MainActivity.this,Activityshowdetail22.class ));
        } else if (textView.getText().toString().equals("ห้องพยาบาล(อาคารสำนักงาน)") ) {
                startActivity(new Intent(MainActivity.this,showgoltc2_1_1.class ));
            } else if (textView.getText().toString().equals("ห้องแนะแนว(อาคารสำนักงาน)")) {
                startActivity(new Intent(MainActivity.this,showgoltc2_1_2.class ));
            } else if (textView.getText().toString().equals("ห้องงานกิจกรรม(อาคารสำนักงาน)")) {
                startActivity(new Intent(MainActivity.this,showgoltc2_2_2.class ));
            } else if (textView.getText().toString().equals("ห้องประชุม(อาคารสำนักงาน)")) {
                startActivity(new Intent(MainActivity.this,showgoltc2_2_3.class ));//        arrayList.add("อาคารอเนกประสงค์");
        } else if (textView.getText().toString().equals("ห้องเก็บของ(อาคารสำนักงาน)")) {
            startActivity(new Intent(MainActivity.this,showgoltc2_2_1.class ));//        arrayList.add("อาคารอเนกประสงค์"); ห้องรองผู้อำนวยการarrayList.add("ห้องอบรม");




        }else if (textView.getText().toString().equals("ห้องการเงิน") ) {
            startActivity(new Intent(MainActivity.this,showgoltc1_1_3.class ));//ตึก 1
        } else if (textView.getText().toString().equals("ห้องทะเบียน")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_1_2.class ));
        } else if (textView.getText().toString().equals("ห้องประชาสัมพันธ์")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_1_1.class));
        } else if (textView.getText().toString().equals("ห้องรองผู้อำนวยการ") ) {
            startActivity(new Intent(MainActivity.this,showgoltc1_1_4.class ));
        } else if (textView.getText().toString().equals("ห้องอบรม")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_2_1.class));
        } else if (textView.getText().toString().equals("ห้องฝ่ายแผนงาน")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_2_2.class ));
        } else if (textView.getText().toString().equals("ห้องกิจกรรม")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_2_3.class));
        }else if (textView.getText().toString().equals("ห้องรองฝ่ายวิชาการ")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_2_4.class ));
        } else if (textView.getText().toString().equals("ห้องงานพัฒนานักเรียน")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_2_5.class));
        }

        else if (textView.getText().toString().equals("ห้องประกันคุณภาพและมาตราฐานนักศึกษา") ) {
            startActivity(new Intent(MainActivity.this,showgoltc1_3_1.class ));
        } else if (textView.getText().toString().equals("131")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_3_3.class ));
        } else if (textView.getText().toString().equals("132")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_3_2.class));
        } else if (textView.getText().toString().equals("133")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_3_4.class ));
        } else if (textView.getText().toString().equals("134")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_3_5.class));
        }else if (textView.getText().toString().equals("141")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_4_3.class ));
        } else if (textView.getText().toString().equals("142")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_4_2.class));
        } else if (textView.getText().toString().equals("143")) {
            startActivity(new Intent(MainActivity.this,showgoltc1_4_4.class ));
        } else if (textView.getText().toString().equals("144")) {
            startActivity(new Intent(MainActivity.this, showgoltc1_4_5.class));
        }





        else { Toast.makeText(this, "ไม่พบข้อมูล", Toast.LENGTH_SHORT).show(); }
    }
}