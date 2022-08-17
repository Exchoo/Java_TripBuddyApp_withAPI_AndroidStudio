package com.example.project;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class task13FirstFragment extends Fragment {
    private ViewGroup container;
    Button acilAraButton,navigateToMapsOne,navigateToMapsTwo;

    public task13FirstFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_task13_first_fragment, container, false); //MainActivity'de 112 Arama butonu yaparsak bütün tablarda görünür. Fragment'ta yapmak istiyorsak view ile button id si aratmamız gerekiyor.
        Init(view);
        navigateToMaps();
        acilAra();
        return view;

    }

    public void Init(View view){
        acilAraButton = (Button)view.findViewById(R.id.acilAraButton);
        navigateToMapsOne = (Button)view.findViewById(R.id.navigateToMapsOne);
        navigateToMapsTwo = (Button)view.findViewById(R.id.navigateToMapsTwo);
    }

    public void acilAra(){
        acilAraButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" +"112" ));
                    //Toast.makeText(getActivity().getApplicationContext(),"bass",Toast.LENGTH_SHORT).show();
                    if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        startActivity(callIntent);
                    } else {
                        requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, 1);
                    }


                }catch (Exception e){
                    System.out.println("HATAAACIK:  "+ e);
                }

            }
        });
    }

    public void navigateToMaps(){
        navigateToMapsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain+View, California");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });    navigateToMapsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }

}