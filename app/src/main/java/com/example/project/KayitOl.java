package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class KayitOl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kayit_ol);
    }
    public void Buton_GirisYap(View view)
    {
        Intent Buton_GirisYap = new Intent(KayitOl.this, GirisYap.class);
        Buton_GirisYap.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_GirisYap);
        finish();
    }
    public void Buton_KayitOl(View view)
    {
        Intent Buton_KayitOl = new Intent(KayitOl.this, KayitOl.class);
        Buton_KayitOl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_KayitOl);
        finish();
    }
}