package com.example.project;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class scene_14_MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public scene_14_MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                scene14FirstFragment firstFragment = new scene14FirstFragment();
                return firstFragment;
            case 1:
                scene14SecondFragment secondFragment = new scene14SecondFragment();
                return secondFragment;
            case 2:
                scene14ThirdFragment thirdFragment = new scene14ThirdFragment();
                return thirdFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}