package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.project.R;

public class scene_19 extends AppCompatActivity {

    String sifre, yeni, tekrar;

    EditText eski_sifre;
    EditText yeni_sifre;
    EditText yeni_sifre_tekrar;

    ImageView sifreyi_güncele;

    ConstraintLayout mainLayout;
    int color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene19);

        mainLayout = (ConstraintLayout)findViewById(R.id.mainLayout);
        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);


        eski_sifre = (EditText) findViewById(R.id.eski_sifre);
        yeni_sifre = (EditText) findViewById(R.id.yeni_sifre);
        yeni_sifre_tekrar = (EditText) findViewById(R.id.yeni_sifre_tekrar);
        sifreyi_güncele = (ImageView) findViewById(R.id.sifreyi_güncele);
        sifreyi_güncele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sifre = eski_sifre.getText().toString();
                yeni = yeni_sifre.getText().toString();
                tekrar = yeni_sifre_tekrar.getText().toString();
                Toast.makeText(getApplicationContext(), "Şifreyi başarıyla güncellediniz", Toast.LENGTH_LONG).show();
                //openactivity_ayarlar();

            }
        });
    }

 /*  public void openactivity_ayarlar() {
        Intent intent = new Intent(this,Ayarlar.class);
        startActivity(intent);
    }*/

    private void showToast(String text) {
        Toast.makeText(scene_19.this, text, Toast.LENGTH_SHORT).show();
    }



}