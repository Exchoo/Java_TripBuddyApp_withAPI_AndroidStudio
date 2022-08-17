package com.example.project;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Date;

public class task13ThirdFragment extends Fragment {
    Button VeterinerBirButton, VeterinerIkiButton,veterinerAraButton;
    ImageView veterinerBir,veterinerIki,veterinerAraImage;
    TextView veterinerAraText,VeterinerAraButtonText;
    public task13ThirdFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_task13_third_fragment, container, false);
        Init(view);
        veterinereGit();
        veterinerAcikMi();
        veterinereYonlendir();



        return view;
    }

    public void Init(View view){
        VeterinerBirButton = (Button) view.findViewById(R.id.VeterinerBirButton);
        VeterinerIkiButton = (Button) view.findViewById(R.id.VeterinerIkiButton);
        veterinerBir = (ImageView) view.findViewById(R.id.veterinerBiracikmi);
        veterinerIki = (ImageView) view.findViewById(R.id.veterinerIkiacikmi);
        veterinerAraButton=(Button) view.findViewById(R.id.VeterinerAraButton);
        veterinerAraImage = (ImageView) view.findViewById(R.id.VeterinerAraImage);
        veterinerAraText = (TextView) view.findViewById(R.id.VeterinerAraText);
        VeterinerAraButtonText = (TextView) view.findViewById(R.id.VeterinerAraButtonText);
    }

    public void veterinereGit(){
        VeterinerBirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Buğday Pazarı, Mahallesi, Öztaş Sk. Gönder Veteriner Kliniği, Çankırı Merkez/Çankırı");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        VeterinerIkiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Başar Veteriner Kliniği, Çankırı Merkez/Çankırı");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

    public void veterinerAcikMi(){
        Date date = new Date();
        if(date.getHours()>18){
            veterinerBir.setImageResource(R.drawable.kapali);

        }
        //VeterinerIki, sadece haftasonu kapali
        if(date.getDay() !=6 ||date.getDay()!=7){
            veterinerIki.setImageResource(R.drawable.acik);
        }

        if(veterinerIki.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.kapali).getConstantState()
                && veterinerBir.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.kapali).getConstantState()) {
            veterinerAraButton.setVisibility(View.VISIBLE);
            veterinerAraButton.setAlpha(0);
            veterinerAraText.setAlpha(1);
            veterinerAraImage.setVisibility(View.VISIBLE);
            VeterinerAraButtonText.setAlpha(1);
        }else{
            veterinerAraButton.setVisibility(View.GONE);
            veterinerAraButton.setAlpha(0);
            veterinerAraText.setAlpha(0);
            veterinerAraImage.setVisibility(View.INVISIBLE);
            VeterinerAraButtonText.setAlpha(0);
        }
    }

    public void veterinereYonlendir(){
        veterinerAraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bulurum.com/dir/veterinerler/cankiri-merkez/"));
                startActivity(intent);
            }
        });
    }
}