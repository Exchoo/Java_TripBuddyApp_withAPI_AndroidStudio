package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class acilDurumActivity extends AppCompatActivity {
    Button acilDurumKapatButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acil_durum);

        acilDurumKapatButton=(Button) findViewById(R.id.acilDurumKapatButton);

        acilDurumKapatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}