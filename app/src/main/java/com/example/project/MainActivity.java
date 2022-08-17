package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mainLayout;
    ImageView Buton_GirisYap;
    int color=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Buton_GirisYap = (ImageView) findViewById(R.id.Buton_GirisYap);

        mainLayout = (ConstraintLayout) findViewById(R.id.mainLayout);

        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        Buton_GirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(color+"aaaadabbbb");
                if(color == 2131165288) {
                    Buton_GirisYap_eski();
                }else{
                    Buton_GirisYap_yeni();
                }
            }
        });

    }

    public void Buton_KayitOl(View view)
    {
        Intent Buton_KayitOl = new Intent(MainActivity.this, KayitOl.class);
        Buton_KayitOl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_KayitOl);
        finish();
    }

//    public void Buton_GirisYap(View view)
//    {
//        Intent Buton_GirisYap = new Intent(MainActivity.this, GirisYap.class);
//        Buton_GirisYap.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(Buton_GirisYap);
//        finish();
//    }

    public void Buton_GirisYap_eski()
    {
        Intent Buton_GirisYap = new Intent(MainActivity.this, GirisYap.class);
        Buton_GirisYap.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_GirisYap);
        finish();
    }
    public void Buton_GirisYap_yeni()
    {
        Intent intent = new Intent(getApplicationContext(),GirisYap.class);
        intent.putExtra("Color", R.drawable.bg_lite);
        startActivity(intent);
    }

}