package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Image_view extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = findViewById(R.id.img);
        String imageResource = getIntent().getStringExtra("image_resource");
        int resID = getResources().getIdentifier(imageResource, "drawable", getPackageName());
        imageView.setImageResource(resID);
    }
}