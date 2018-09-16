package com.example.android.dhakatourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by User on 9/9/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm, FoodActivity mainActivity){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0)
                return new Fast_Fragment();
        else if(position==1)
            return new Cusine_Fragment();
        else return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0)
            return "Fast Food";
        else if(position==1)
            return "Cusines";
        else return null;
    }
}
