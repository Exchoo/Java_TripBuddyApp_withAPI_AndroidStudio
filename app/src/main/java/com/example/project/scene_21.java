package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class scene_21 extends AppCompatActivity {

    ConstraintLayout mainLayout;
    TextView darkThemeButton;
    int color =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene21);

        mainLayout = (ConstraintLayout)findViewById(R.id.mainLayout);
        darkThemeButton = (TextView) findViewById(R.id.darkThemeButton);
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        darkThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),scene_4.class);
                intent.putExtra("Color", R.drawable.bg_lite);
                startActivity(intent);
            }
        });
    }
}