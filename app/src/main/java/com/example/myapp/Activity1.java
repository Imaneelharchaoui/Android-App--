package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Button btn00 =findViewById(R.id.btn00);
        Button btn01 =findViewById(R.id.btn01);
        Button btn02 =findViewById(R.id.btn02);
        Button btn03 =findViewById(R.id.btn03);
        Button btn04 =findViewById(R.id.btn04);
        Button btn05 =findViewById(R.id.btn05);



        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open01();
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open02();
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open03();
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open04();
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open05();
            }
        });


    }

    public void Open01(){
        Intent intent2=new Intent(this,Stock.class);
        startActivity(intent2);
    }
    public void Open02(){
        Intent intent3=new Intent(this,Production.class);
        startActivity(intent3);
    }
    public void Open03(){
        Intent intent4=new Intent(this,Vente.class);
        startActivity(intent4);
    }
    public void Open04(){
        Intent intent5=new Intent(this,Tresorie.class);
        startActivity(intent5);
    }
    public void Open05(){
        Intent intent5=new Intent(this,Tresorie.class);
        startActivity(intent5);
    }


}

