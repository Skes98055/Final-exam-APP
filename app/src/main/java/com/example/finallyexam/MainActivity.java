package com.example.finallyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bmi,water,walk,card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi=findViewById(R.id.button);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        water=findViewById(R.id.button6);
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        walk=findViewById(R.id.button7);
        walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        card=findViewById(R.id.button8);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}