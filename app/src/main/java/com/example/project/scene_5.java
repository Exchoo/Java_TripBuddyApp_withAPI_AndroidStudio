package com.example.project;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.project.R;

public class scene_5 extends AppCompatActivity {
    ConstraintLayout mainLayout;
    ImageView buton_git;
    int color=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_scene5);

        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);
        buton_git =(ImageView) findViewById(R.id.buton_git);

        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        buton_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(color+"aaaaabbbb");
                if(color == 2131165288) {
                    buton_git_eski();
                }else{
                    buton_git_yeni();
                }
            }
        });
    }

    public void buton_git_eski()
    {
        Intent intent = new Intent(scene_5.this, scene_6.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
    public void buton_git_yeni()
    {
        Intent intent = new Intent(getApplicationContext(),scene_6.class);
        intent.putExtra("Color", R.drawable.bg_lite);
        startActivity(intent);
    }
}