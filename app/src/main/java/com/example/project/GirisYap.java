package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GirisYap extends AppCompatActivity {
    ImageView buttonGirisYap;
    LinearLayout mainLayout;
    int color =0;
    public EditText ad,ad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_giris_yap);
        buttonGirisYap=this.findViewById(R.id.buttonGirisYap);
       /* giris_Yap()*/

        ad= findViewById(R.id.edittext);
        ad1=findViewById(R.id.edittext1);

        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);

        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        buttonGirisYap.setOnClickListener(new View.OnClickListener() {
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

   /*public void giris_Yap(){
        buttonGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),scene_11.class);
                startActivity(intent);
            }
        });
    }*/
     public void Buton_GirisYap_eski()
      {

           Intent intent = new Intent(getApplicationContext(),scene_11.class);
           intent.putExtra("Value",ad.getText().toString());
           intent.putExtra("Value1",ad1.getText().toString());
           startActivity(intent);
     }
        public void Buton_GirisYap_yeni()
      {

           Intent intent = new Intent(getApplicationContext(),scene_11.class);
           intent.putExtra("Value",ad.getText().toString());
           intent.putExtra("Value1",ad1.getText().toString());
          intent.putExtra("Color", R.drawable.bg_lite);
          startActivity(intent);

     }

    public void Buton_KayitOl(View view)
    {
        Intent Buton_KayitOl = new Intent(GirisYap.this, scene_4.class);
        Buton_KayitOl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_KayitOl);
        finish();
    }
}