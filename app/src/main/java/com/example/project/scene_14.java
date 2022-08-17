package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.example.project.R;

public class scene_14 extends AppCompatActivity {
    AppCompatRadioButton arac_rb,taksi_rb,duraklar_rb;
    ImageView b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene14);

        //tıklanabilir buttonlar araç kiralama,taksi,duraklar.
        arac_rb = findViewById(R.id.arac_rb);
        taksi_rb =findViewById(R.id.taksi_rb);
        duraklar_rb =findViewById(R.id.duraklar_rb);

        //arama gönderme kısmı
        b1 =(ImageView)findViewById(R.id.ic_ara1);
        b2 =(ImageView)findViewById(R.id.ic_ara2);
        b3 =(ImageView)findViewById(R.id.ic_ara3);
        b4 =(ImageView)findViewById(R.id.ic_ara4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762126160");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762139999");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762131021");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762132038");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });


    }
    public void RadioButtonClicked (View view) {
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.arac_rb:
                if( isSelected){
                    arac_rb.setTextColor(Color.BLACK);
                    taksi_rb.setTextColor(Color.WHITE);
                    duraklar_rb.setTextColor(Color.WHITE);
                }
                break;
            case R.id.taksi_rb:
                arac_rb.setTextColor(Color.WHITE);
                taksi_rb.setTextColor(Color.BLACK);
                duraklar_rb.setTextColor(Color.WHITE);

                break;
            case R.id.duraklar_rb:
                arac_rb.setTextColor(Color.WHITE);
                taksi_rb.setTextColor(Color.WHITE);
                duraklar_rb.setTextColor(Color.BLACK);
                break;
        }
    }
    public void geri_git2(View view)
    {
        Intent geri_git = new Intent(scene_14.this,scene_11.class);
        geri_git.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(geri_git);
        finish();
    }

}