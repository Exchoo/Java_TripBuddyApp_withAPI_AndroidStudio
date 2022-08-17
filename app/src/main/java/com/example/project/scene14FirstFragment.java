package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class scene14FirstFragment extends Fragment {
    private ViewGroup container;
    Button acilAraButton,navigateToMapsOne,navigateToMapsTwo;

    public scene14FirstFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_scene14, container, false); //MainActivity'de 112 Arama butonu yaparsak bütün tablarda görünür. Fragment'ta yapmak istiyorsak view ile button id si aratmamız gerekiyor.
        Init(view);
        navigateToMaps();
        return view;

    }

    public void Init(View view){
        acilAraButton = (Button)view.findViewById(R.id.acilAraButton);
        navigateToMapsOne = (Button)view.findViewById(R.id.navigateToMapsOne);
        navigateToMapsTwo = (Button)view.findViewById(R.id.navigateToMapsTwo);
    }




    public void navigateToMaps(){
        navigateToMapsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762126160");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });    navigateToMapsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762126160");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

    }

}