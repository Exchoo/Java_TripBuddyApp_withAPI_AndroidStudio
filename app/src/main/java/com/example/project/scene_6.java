
package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.project.R;

public class scene_6 extends AppCompatActivity {
    ConstraintLayout mainLayout;
    ImageView buton_git2;
    int color=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_scene6);

        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);
        buton_git2 =(ImageView) findViewById(R.id.buton_git2);


        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        buton_git2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(color+"aaaadabbbb");
                if(color == 2131165288) {
                    buton_git2_eski();
                }else{
                    buton_git2_yeni();
                }
            }
        });
    }

    public void buton_git2_eski()
    {
        Intent buton_git2 = new Intent(scene_6.this,scene_7.class);
        buton_git2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(buton_git2);
        finish();
    }
    public void buton_git2_yeni()
    {
        Intent intent = new Intent(getApplicationContext(),scene_7.class);
        intent.putExtra("Color", R.drawable.bg_lite );
        startActivity(intent);
    }
}

