package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ayarlar extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    ImageView image3;
    /*TextView tv;
    String st;*/

    public TextView al,al1;
    public ImageView image;
    ProgressDialog progressDialog;

    LinearLayout mainLayout;
    int color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ayarlar);
        image1 = findViewById(R.id.imageView16);
        image2 = findViewById(R.id.imageView1);
        image3 = findViewById(R.id.imageView2);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

      /*  tv=findViewById(R.id.textView);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);*/

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(Ayarlar.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );

            }
        });

        al=(TextView) findViewById(R.id.textView);
        al1=(TextView) findViewById(R.id.textView1);
        image=(ImageView) findViewById(R.id.image);
        Intent intent = getIntent();
        Intent intent1 = getIntent();
        String ad = intent.getStringExtra("Value");
        String ad1 = intent1.getStringExtra("Value1");
        al.setText(ad);
        al1.setText(ad1);
        /*image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_11.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }
        });*/

    }
    @Override
    public void onBackPressed() {
        progressDialog.dismiss();
    }
    public void image2(View view){
        Intent  intent= new Intent(Ayarlar.this,Ayarlar.class);
        startActivity(intent);
    }
    public void image3(View view){
        try {
            if(color == 2131165288) {
                Intent intent = new Intent(getApplicationContext(), GirisYap.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(getApplicationContext(),GirisYap.class);
                intent.putExtra("Color", R.drawable.bg_lite);
                startActivity(intent);
            }

        } catch (Exception e) {
            System.out.println("Hataaa" + e);
        }

    }


    public void Buton_AnasayfayaGit(View view)
    {

        try {
            if(color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_11.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }else{
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_11.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            System.out.println("Hataaa" + e);
        }
    }

    public void Buton_Konum(View view)
    {

        try {
            if (color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_22.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            } else {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_22.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Buton_Tema(View view)
    {
        try {
            if (color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_21.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            } else {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_21.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public void Buton_Dil(View view)
    {
        try {
            if (color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_20.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            } else {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_20.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void Buton_SifreDegistirme(View view)
    {
        try {
            if (color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_19.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            } else {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_19.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public void Buton_HesapTercihleri(View view)
    {
        try {
            if (color == 2131165288) {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_25.class);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            } else {
                Intent Buton_AnasayfayaGit = new Intent(Ayarlar.this, scene_25.class);
                Buton_AnasayfayaGit.putExtra("Color", R.drawable.bg_lite);
                Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(Buton_AnasayfayaGit);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    /*
    public void Buton_Cikis(View view)
    {
        Intent Buton_Cikis = new Intent(Ayarlar.this, CikisSorgu.class);
        Buton_Cikis.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Cikis);
        finish();
    }*/
}