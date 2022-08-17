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

public class task13SecondFragment extends Fragment {
    Date getHours= new Date();
    ImageView eczaneBirAcikMi,eczaneIkiAcikMi,nobetciEczaneImageView;
    TextView eczaneKapaliText,nobetciEczaneButtonText;
    Button nobetciEczaneButton,eczaneBir,eczaneIki;

    public task13SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_task13_second_fragment, container, false);
        Init(view);
        hastaneAcikMi();
        nobetciEczaneYonlendir();
        eczaneGoogleMaps();
        return view;
    }

    public void Init(View view){
        eczaneBirAcikMi = (ImageView) view.findViewById(R.id.eczanebiracikmi);
        eczaneIkiAcikMi = (ImageView) view.findViewById(R.id.eczaneikiacikmi);
        nobetciEczaneButton = (Button) view.findViewById(R.id.nobetciEczaneButton);
        eczaneKapaliText = (TextView) view.findViewById(R.id.nobetciEczaneText);
        nobetciEczaneImageView = (ImageView) view.findViewById(R.id.nobetciEczaneImageView);
        eczaneBir = (Button) view.findViewById(R.id.navigateToMapsOne);
        eczaneIki = (Button) view.findViewById(R.id.navigateToMapsTwo);
        nobetciEczaneButtonText = (TextView) view.findViewById(R.id.nobetciEczaneButtonText);
    }

    public void hastaneAcikMi(){
        Date date = new Date();

        if(date.getHours()>17 || date.getDay() == 6 || date.getDay()==7){

            eczaneBirAcikMi.setImageResource(R.drawable.kapali);
            eczaneIkiAcikMi.setImageResource(R.drawable.kapali);
            eczaneKapaliText.setAlpha(1);
            nobetciEczaneImageView.setVisibility(View.VISIBLE);
            nobetciEczaneButton.setVisibility(View.VISIBLE);
            nobetciEczaneButton.setAlpha(0);
            nobetciEczaneButtonText.setAlpha(1);

            //Nöbetçi eczaneleri kendi oluşturduğun API'yle başka bir activity'ded çekebilirsin.
        }else if(date.getHours()<8 && date.getHours()<17 && date.getDay() != 6 || date.getDay() !=7){
            eczaneBirAcikMi.setImageResource(R.drawable.acik);
            eczaneIkiAcikMi.setImageResource(R.drawable.acik);
            eczaneKapaliText.setVisibility(View.GONE);
            nobetciEczaneImageView.setVisibility(View.GONE);
            eczaneKapaliText.setVisibility(View.GONE);
            nobetciEczaneButtonText.setAlpha(0);

        }
    }

    public void nobetciEczaneYonlendir(){
        nobetciEczaneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eczaneler.gen.tr/nobetci-cankiri"));
                startActivity(intent);
            }
        });
    }

    public void eczaneGoogleMaps(){
        eczaneBir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Hayat Eczanesi, Çankırı Merkez/Çankırı");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        eczaneIki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Can Eczanesi, Çankırı Merkez/Çankırı");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

}