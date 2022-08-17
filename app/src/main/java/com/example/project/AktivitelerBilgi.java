package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AktivitelerBilgi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviteler_bilgi);
    }

    public void Buton_AnasayfayaGit(View view)
    {
        Intent Buton_AnasayfayaGit = new Intent(AktivitelerBilgi.this, Aktiviteler.class);
        Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_AnasayfayaGit);
        finish();
    }
}