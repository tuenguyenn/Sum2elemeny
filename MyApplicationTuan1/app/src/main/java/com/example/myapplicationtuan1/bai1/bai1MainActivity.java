package com.example.myapplicationtuan1.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import com.example.myapplicationtuan1.R;

public class bai1MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText txt1,txt2;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_main);


        txt1= findViewById(R.id.etext1);
        txt2= findViewById(R.id.etext2);
        btn1= findViewById(R.id.button1);
        tv1= findViewById(R.id.bai1tv1);
        btn1.setOnClickListener(v -> {
            caculatesum();
        });
    }
    private void caculatesum(){
        String str1,str2;
        float so1,so2;
        str1=txt1.getText().toString();
        so1= Float.parseFloat(str1);
        str2=txt2.getText().toString();
        so2= Float.parseFloat(str2);
        float tong= so1+so2;
        tv1.setText(String.valueOf(tong));


    }


}