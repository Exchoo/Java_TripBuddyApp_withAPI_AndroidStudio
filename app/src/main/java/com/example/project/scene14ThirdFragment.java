package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class scene14ThirdFragment extends Fragment {
    Button VeterinerBirButton, VeterinerIkiButton,veterinerAraButton;
    ImageView veterinerBir,veterinerIki,veterinerAraImage;
    TextView veterinerAraText,VeterinerAraButtonText;
    public scene14ThirdFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third_scene14, container, false);
        Init(view);

        return view;
    }

    public void Init(View view){
        VeterinerBirButton = (Button) view.findViewById(R.id.VeterinerBirButton);
        VeterinerIkiButton = (Button) view.findViewById(R.id.VeterinerIkiButton);
        veterinerBir = (ImageView) view.findViewById(R.id.veterinerBiracikmi);
        veterinerIki = (ImageView) view.findViewById(R.id.veterinerIkiacikmi);

    }
}
