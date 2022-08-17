package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class scene_11 extends AppCompatActivity {
    private Timer sureTimer;
    private Handler sureHandler;
    private int sayac = 0;
    int count = 0;
    AbsoluteLayout mainLayout,a;
    TextView aaaText,buttonaBasma,acilDurum,textView2;
    Button acilDurumButton,geriButton;
    ProgressBar progressbar;
    ImageView geriButtonImageView,bottomImageView,settingsImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene11);

        Button ulasimButton = (Button) findViewById(R.id.UlasimButton);
        Button otelButton = (Button) findViewById(R.id.otelButton);
        Button saglikButton = (Button) findViewById(R.id.SaglikButton);
        Button aktiviteButton = (Button) findViewById(R.id.actButton);
        Button BottomSolVector = (Button) findViewById(R.id.solOkButton);
        Button BottomSagVector = (Button) findViewById(R.id.sagOkButton);
        bottomImageView = (ImageView)findViewById(R.id.bottomImageView);
        /*imagebutton = (ImageView)findViewById(R.id.imageView1);*/

        //Emergency Call Objects

        mainLayout = (AbsoluteLayout) findViewById(R.id.mainLayout);
        a = (AbsoluteLayout) findViewById(R.id.absolute);
        aaaText = (TextView) findViewById(R.id.aaaText);
        acilDurumButton = (Button) findViewById(R.id.acilDurumButton);
        buttonaBasma = (TextView) findViewById(R.id.butonaBasma);
        progressbar = (ProgressBar) findViewById(R.id.progressbar);
        geriButton =(Button)findViewById(R.id.geriButton);
        geriButtonImageView = (ImageView) findViewById(R.id.geriButtonImageView);
        acilDurum = (TextView)findViewById(R.id.acilDurum);
        settingsImage = (ImageView) findViewById(R.id.settingsImage);

        //Renk Değiştirme
        int color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);



        ulasimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(color == 2131165288) {
                        Intent intent = new Intent(getApplicationContext(), scene_14_main.class);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(getApplicationContext(),scene_14_main.class);
                        intent.putExtra("Color", R.drawable.bg_lite);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println("Hataaa" + e);
                }

            }
        });



        otelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(color == 2131165288) {
                        Intent intent = new Intent(getApplicationContext(), scene_12.class);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(getApplicationContext(),scene_12.class);
                        intent.putExtra("Color", R.drawable.bg_lite);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println("Hataaa" + e);
                }

            }
        });

        saglikButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(color == 2131165288) {
                        Intent intent = new Intent(getApplicationContext(), scene_13.class);
                        startActivity(intent);
                    }else{
                        Intent intent = new Intent(getApplicationContext(),scene_13.class);
                        intent.putExtra("Color", R.drawable.bg_lite);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println("Hataaa" + e);
                }

            }
        });

        aktiviteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        if(color == 2131165288) {
                            Intent intent = new Intent(getApplicationContext(), Aktiviteler.class);
                            startActivity(intent);
                        }else{
                            Intent intent = new Intent(getApplicationContext(),Aktiviteler.class);
                            intent.putExtra("Color", R.drawable.bg_lite);
                            startActivity(intent);
                        }

                    } catch (Exception e) {
                        System.out.println("Hataaa" + e);
                    }

                }
        });

        acilDurumButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            acilDurumButton.setAlpha(0);
            a.setAlpha(0);
            geriButton.setVisibility(View.GONE);
            count=0;
            sayac=0;
            geriButtonImageView.setVisibility(View.GONE);
            Intent intent = new Intent(getApplicationContext(), acilDurumActivity.class );
            startActivity(intent);

        }
        });
        //BottomImage için sağ sol oklara basarak image değiştirme.
        BottomSolVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomImageView.setImageResource(R.drawable.custombutton);

                if(bottomImageView.getResources().equals(R.drawable.custombutton)){

                }
            }
        });

        BottomSagVector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomImageView.setImageResource(R.drawable.bottomimg);
            }
        });


        geriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sureTimer.cancel();
                buttonaBasma.setText(null);
                acilDurumButton.setAlpha(0);
                a.setAlpha(0);
                count=0;
                sayac=0;
            }
        });
        settingsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(color == 2131165288) {
                        Intent imagebutton = new Intent(scene_11.this, Ayarlar.class);
                        imagebutton.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(imagebutton);
                    }else{
                        Intent intent = new Intent(getApplicationContext(),Ayarlar.class);
                        intent.putExtra("Color", R.drawable.bg_lite);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    System.out.println("Hataaa" + e);
                }

            }
        });
    }



    public boolean first, second;




    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            first = true;
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            second = true;
        }

        if (first && second) { //3 Kez ses açma ve kapama tuşlarına basıldığında
            count++;
            if (count == 50) {
                sureSayac();
                a.setAlpha((float) 0.8);
            }
        }
        return true;
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            first = false;
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            second = false;
        }
        return true;
    }

    private void sureSayac(){

        sureHandler = new Handler();
        sureTimer = new Timer();

        TimerTask sureTimerTask = new TimerTask() {
            @Override
            public void run() {

                sureHandler.post(new Runnable() {
                    @Override
                    public void run() { //Her saniye girilen metot

                        sayac++;

                        // Herhangi bir hata oluşmaması için runOnUiThread içinde başlatıyoruz
                        runOnUiThread(new Runnable() {
                            @SuppressLint("ResourceAsColor")
                            @Override
                            public void run() {

                                // Süreyi her defasında sure bileşenimizde gösteriyoruz
                                aaaText.setText(String.valueOf(sayac));
                                progressbar.setProgress(sayac);
                                progressbar.getProgressDrawable().setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
                                geriButton.setVisibility(View.VISIBLE);
                                geriButtonImageView.setVisibility(View.VISIBLE);
                                buttonaBasma.setText("Durdurmak için panelden çıkın.");
                                a.setAlpha(a.getAlpha()+(float)0.05);


                                if(aaaText.getText().equals("6")){
                                    sureTimer.cancel();
                                    buttonaBasma.setText(null);
                                    acilDurumButton.setAlpha(1);
                                    acilDurumButton.setBackgroundResource(R.drawable.yuzoniliacilara);
                                    acilDurumButton.setVisibility(View.VISIBLE);
                                    acilDurumButton.setTextColor(R.color.black);
                                    aaaText.setText("↓");
                                    a.setAlpha(1);
                                    a.setBackgroundResource(R.color.black);
                                    aaaText.setTextSize((float)50);

                                    sayac=0;
                                    count=0;
                                }

                            }
                        });

                    }
                });

            }
        };

        sureTimer.schedule(sureTimerTask,0,1000); //Saniyede bir kez girilecek

    }







    /*Ses Açma Kapatma Tuşuna uzun süreli bastıktan sonra fonksiyon çalıştıran kod*/
    /*Kullanıcı her uzun basışında i'yi bir azalt (3-2-1)  olduğunda fonskiyon çalışsın */
    /*Ekrana Bir imageview Koy visibility'si olmasın. Yukardaki işlem tamamlandığında görünür olsun, Her şeyi kapsayan layout alphası 0.2 olsun Ya da z index*/
    /*Progress Bar Ekle her ses açma tuşuna uzun basıldığında 1 tık artsın güzel gözüküyor https://www.youtube.com/watch?v=6xUG9d7a2q8*/
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event){
//        if(keyCode==KeyEvent.KEYCODE_VOLUME_UP){
//            event.startTracking();
//            return true;
//        }
//        return super.onKeyDown(keyCode,event);
//    }
//    @Override
//    public boolean onKeyLongPress(int keyCode,KeyEvent event){
//        if(keyCode==KeyEvent.KEYCODE_VOLUME_UP){
//            Toast.makeText(getApplicationContext(),"Uzun bass",Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        return onKeyLongPress(keyCode,event);
//    }
}