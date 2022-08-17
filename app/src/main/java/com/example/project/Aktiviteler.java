package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Aktiviteler extends AppCompatActivity {

    LinearLayout mainLayout;
    int color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviteler);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);
    }

    public void Buton_AnasayfayaGit(View view)
    {
        Intent Buton_AnasayfayaGit = new Intent(Aktiviteler.this, scene_11.class);
        Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_AnasayfayaGit);
        finish();
    }

    public void Buton_Gezi(View view)
    {
        Intent Buton_Gezi = new Intent(Aktiviteler.this, Aktiviteler.class);
        Buton_Gezi.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Gezi);
        finish();
    }

    public void Buton_Oyun(View view)
    {
        Intent Buton_Oyun = new Intent(Aktiviteler.this, AktivitelerOyun.class);
        Buton_Oyun.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Oyun);
        finish();
    }

    public void Buton_Kafe(View view)
    {
        Intent Buton_Kafe = new Intent(Aktiviteler.this, AktivitelerKafe.class);
        Buton_Kafe.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Kafe);
        finish();
    }
    public void Buton_IlgazDagiGit(View view)
    {
        Intent Buton_IlgazDagiGit = new Intent(Aktiviteler.this, AktivitelerBilgi.class);
        Buton_IlgazDagiGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_IlgazDagiGit);
        finish();
    }
}