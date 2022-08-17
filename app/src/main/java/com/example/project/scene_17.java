package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class scene_17 extends AppCompatActivity {
    ImageView image;
    ImageView image1;
    ImageView image2;
    TextView textView6;
    ProgressDialog progressDialog;

    LinearLayout mainLayout;
    int color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene17);
        image = findViewById(R.id.imageView16);
        image1 = findViewById(R.id.imageView1);
        image2 = findViewById(R.id.imageView2);
        textView6 = findViewById(R.id.textView6);
        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(scene_17.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );

            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(color == 2131165288) {
                        Intent imagebutton = new Intent(getApplicationContext(), scene_22.class);
                        imagebutton.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(imagebutton);
                    }else{
                        Intent intent = new Intent(getApplicationContext(),scene_22.class);
                        intent.putExtra("Color", R.drawable.bg_lite);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println("Hataaa" + e);
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        progressDialog.dismiss();
    }
    public void image1(View view){
        Intent  intent= new Intent(scene_17.this,scene_17.class);
        startActivity(intent);
    }
    public void image2(View view){
        Intent  intent= new Intent(scene_17.this,GirisYap.class);
        startActivity(intent);
    }
}