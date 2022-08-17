package com.example.project;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class task13MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public task13MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                task13FirstFragment firstFragment = new task13FirstFragment();
                return firstFragment;
            case 1:
                task13SecondFragment secondFragment = new task13SecondFragment();
                return secondFragment;
            case 2:
                task13ThirdFragment thirdFragment = new task13ThirdFragment();
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
