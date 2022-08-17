package com.example.project;





import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class scene_22 extends AppCompatActivity {
    LinearLayout mainLayout;
    int color = 0;

    TextView textView4,textView5;
    FusedLocationProviderClient fusedLocationProviderClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene22);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ActivityCompat.checkSelfPermission(scene_22.this,
                        Manifest.permission.ACCESS_FINE_LOCATION)== PackageManager.PERMISSION_GRANTED){
                    getLocation();
                }else{
                    ActivityCompat.requestPermissions(scene_22.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},44);
                }
            }
        });

        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);
    }

    @SuppressLint("MissingPermission")
    private void getLocation() {
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location= task.getResult();
                if(location != null){

                    try {
                        Geocoder geocoder = new Geocoder(scene_22.this, Locale.getDefault());
                        List<Address> addresses = geocoder.getFromLocation(
                                location.getLatitude(),location.getLongitude(),1
                        );

                        textView5.setText(Html.fromHtml(
                                "<font color='#6200EE'><b>adress:</b><br></font>"
                                        + addresses.get(0).getAddressLine(0)
                        ));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}



