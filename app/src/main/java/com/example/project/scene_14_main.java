package com.example.project;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class scene_14_main extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Button exitButton;
    Button acilAraButton;
    RelativeLayout mainLayout;
    int color = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scene14);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        exitButton = (Button) findViewById(R.id.exitButton);
        acilAraButton = (Button)findViewById(R.id.acilAraButton);


        mainLayout = (RelativeLayout)findViewById(R.id.mainLayout);
        color = getIntent().getIntExtra("Color", R.drawable.bg);
        mainLayout.setBackgroundResource(color);


        //AlertDialog//
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Turist App");
//        builder.setMessage("Konuma yonlendirilmek için lütfen açık/kapalı butonlarına tıklayınız ?");
//        builder.setPositiveButton("TAMAM",null);
//        builder.show();

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tabLayout.addTab(tabLayout.newTab().setText("Araç Kirala"));
        tabLayout.addTab(tabLayout.newTab().setText("Taksi"));
        tabLayout.addTab(tabLayout.newTab().setText("Duraklar"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final scene_14_MyAdapter adapter = new scene_14_MyAdapter(this,getSupportFragmentManager(),
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

    }
}