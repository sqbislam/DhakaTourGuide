package com.example.android.dhakatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.android.dhakatourguide.R.id.shopImg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView shop=(ImageView) findViewById(shopImg);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ShopActivity.class));

            }
        });

        final ImageView hotel=(ImageView) findViewById(R.id.hotelImg);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,HotelActivity.class));
            }
        });


        final ImageView attraction=(ImageView) findViewById(R.id.attractionImg);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,AttractionActivity.class));
            }
        });


        final ImageView food=(ImageView) findViewById(R.id.foodImg);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FoodActivity.class));
            }
        });
    }

    boolean doubleBackToExitPressedOnce = false;

    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            MainActivity.this.finish();
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click Back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}
