package com.example.project;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.project.R;

public class scene_4 extends AppCompatActivity {
    ConstraintLayout mainLayout;;
    ImageView buton_basla;
    int color=0;
    String prevStarted = "yes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_scene4);


        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);
        buton_basla = (ImageView) findViewById(R.id.buton_basla);
        System.out.println(color+"aaa");
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        buton_basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("abc"+color);
                if(color == 2131165288) {
                    buton_basla_eski();
                }else{
                    buton_basla_yeni();
                }
            }
        });
    }

    public void buton_basla_eski()
    {
        Intent buton_basla = new Intent(scene_4.this, scene_5.class);
        buton_basla.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(buton_basla);
        finish();
    }

    public void buton_basla_yeni()
    {
        Intent intent = new Intent(getApplicationContext(),scene_5.class);
        intent.putExtra("Color", R.drawable.bg_lite);
        startActivity(intent);
    }


    //--------------------- Eğer Tanıtım Sayfasının Sadece bir Kere açılmasını istiyorsak --------------------- //
//    @Override
//    protected void onResume() {
//        super.onResume();
//        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
//        if (!sharedpreferences.getBoolean(prevStarted, false)) {
//            SharedPreferences.Editor editor = sharedpreferences.edit();
//            editor.putBoolean(prevStarted, Boolean.TRUE);
//            editor.apply();
//        } else {
//            if(color == 2131165288) {
//                Intent buton_basla = new Intent(scene_4.this, scene_11.class);
//                buton_basla.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(buton_basla);
//                finish();
//            }else{
//                Intent intent = new Intent(getApplicationContext(),scene_5.class);
//                intent.putExtra("Color", R.drawable.bg_lite);
//                startActivity(intent);
//            }
//        }
//    }
}