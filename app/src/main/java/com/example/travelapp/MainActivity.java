package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView china;
    Button chinaBtn;
    ImageView france;
    Button franceBtn;
    ImageView japan;
    Button japanBtn;
    ImageView spain;
    Button spainBtn;
    ImageView thailand;
    Button thailandBtn;
    ImageView turkey;
    Button turkeyBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        china = findViewById(R.id.chinaImg);
        france = findViewById(R.id.franceImg);
        japan = findViewById(R.id.japanImg);
        spain = findViewById(R.id.spainImg);
        thailand = findViewById(R.id.thailandImg);
        turkey = findViewById(R.id.turkeyImg);

        chinaBtn = findViewById(R.id.chinaBtn);
        franceBtn = findViewById(R.id.franceBtn);
        japanBtn = findViewById(R.id.japanBtn);
        spainBtn = findViewById(R.id.spainBtn);
        thailandBtn = findViewById(R.id.thailandBtn);
        turkeyBtn = findViewById(R.id.turkeyBtn);
    }

    public void openChinaHome(View view) {
        Intent intent = new Intent(MainActivity.this, HomeChina.class);
        startActivity(intent);
    }
}