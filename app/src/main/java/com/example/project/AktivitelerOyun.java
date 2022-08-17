package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AktivitelerOyun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviteler_oyun);
    }
    public void Buton_AnasayfayaGit(View view)
    {
        Intent Buton_AnasayfayaGit = new Intent(AktivitelerOyun.this, scene_11.class);
        Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_AnasayfayaGit);
        finish();
    }

    public void Buton_Gezi(View view)
    {
        Intent Buton_Gezi = new Intent(AktivitelerOyun.this, Aktiviteler.class);
        Buton_Gezi.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Gezi);
        finish();
    }

    public void Buton_Oyun(View view)
    {
        Intent Buton_Oyun = new Intent(AktivitelerOyun.this, AktivitelerOyun.class);
        Buton_Oyun.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Oyun);
        finish();
    }

    public void Buton_Kafe(View view)
    {
        Intent Buton_Kafe = new Intent(AktivitelerOyun.this, AktivitelerKafe.class);
        Buton_Kafe.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Kafe);
        finish();
    }
}