package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.project.R;

public class scene_7 extends AppCompatActivity {
    ConstraintLayout mainLayout;
    ImageView buton_git3;
    int color=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_scene7);

        buton_git3 = (ImageView) findViewById(R.id.buton_git3);
        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);

        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        buton_git3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(color+"aaaadabbbb");
                if(color == 2131165288) {
                    buton_git3_eski();
                }else{
                    buton_git3_yeni();
                }
            }
        });
    }

    public void buton_git3_eski()
    {
        Intent buton_git3 = new Intent(getApplicationContext(), MainActivity.class);
        buton_git3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(buton_git3);
        finish();
    }
    public void buton_git3_yeni()
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("Color", R.drawable.bg_lite);
        startActivity(intent);
    }
}