package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0);
        Button btn0 =findViewById(R.id.btn0);
        Button btn1 =findViewById(R.id.btn1);
        Button btn2 =findViewById(R.id.btn2);
        Button btn3 =findViewById(R.id.btn3);
        Button btn4 =findViewById(R.id.btn4);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open0();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open1();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open2();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open4();
            }
        });



    }
    public void Open0(){
        Intent intent1=new Intent(this,Activity1.class);
        startActivity(intent1);
    }
    public void Open1(){
        Intent intent2=new Intent(this,Stock.class);
        startActivity(intent2);
    }
    public void Open2(){
        Intent intent3=new Intent(this,Production.class);
        startActivity(intent3);
    }
    public void Open3(){
        Intent intent4=new Intent(this,Vente.class);
        startActivity(intent4);
    }
    public void Open4(){
        Intent intent5=new Intent(this,Tresorie.class);
        startActivity(intent5);
    }

}
