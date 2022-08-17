package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class scene_25 extends AppCompatActivity {
    LinearLayout mainLayout;
    int color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene25);
        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);
    }
}