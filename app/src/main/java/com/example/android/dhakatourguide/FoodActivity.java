package com.example.android.dhakatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 8/30/2017.
 */

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodactivity);

        ViewPager viewpager=(ViewPager)findViewById(R.id.viewpager);
        viewpager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), FoodActivity.this));

    }

    @Override
    public void onBackPressed() {
        FoodActivity.this.finish();
    }
}
