package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class scene14SecondFragment extends Fragment {

    Button acilAraButton,navigateToMapsOne,navigateToMapsTwo,taksiucAraButton;

    public scene14SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_scene14, container, false);
        Init(view);
        navigateToMaps();
        return view;
    }

    public void Init(View view){
        acilAraButton = (Button)view.findViewById(R.id.acilAraButton);
        navigateToMapsOne = (Button)view.findViewById(R.id.navigateToMapsOne);
        navigateToMapsTwo = (Button)view.findViewById(R.id.navigateToMapsTwo);
        taksiucAraButton = (Button) view.findViewById(R.id.taksiucAraButton);
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
                Uri uri = Uri.parse("tel:03762139999");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        taksiucAraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762131021");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

    }

    }

