package com.example.navigatioinview;


import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SliderPagerAdapter extends FragmentStateAdapter {

    final static int SLIDES_COUNT = 3;

    public SliderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return TabFragment1.newInstance(position);
            case 1: return TabFragment2.newInstance(position);
            case 2: return TabFragment3.newInstance(position);
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return SLIDES_COUNT;
    }
}
