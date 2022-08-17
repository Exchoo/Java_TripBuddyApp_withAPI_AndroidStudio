package com.example.project;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class scene_13 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button exitButton;
    Button acilAraButton;
    RelativeLayout mainLayout;
    int color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene13);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        exitButton = (Button) findViewById(R.id.exitButton);
        acilAraButton = (Button)findViewById(R.id.acilAraButton);
        mainLayout = (RelativeLayout)findViewById(R.id.mainLayout);


        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

        //AlertDialog//
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Turist App");
//        builder.setMessage("Konuma yonlendirilmek için lütfen açık/kapalı butonlarına tıklayınız ?");
//        builder.setPositiveButton("TAMAM",null);
//        builder.show();

        try {
            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            tabLayout.addTab(tabLayout.newTab().setText("Hastane"));
            tabLayout.addTab(tabLayout.newTab().setText("Eczane"));
            tabLayout.addTab(tabLayout.newTab().setText("Veteriner"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            final task13MyAdapter adapter = new task13MyAdapter(this,getSupportFragmentManager(),
                    tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }
                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }
                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
            });

        }catch (Exception e){
            System.out.println("HATAAAA"+e);
        }
    }

}