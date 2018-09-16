package com.example.android.dhakatourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by User on 8/30/2017.
 */

public class AttractionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitems);

        ArrayList<Word> Attractions = new ArrayList();


        Attractions.add(new Word(R.string.Attraction1, R.string.Attraction1desc, R.drawable.lalbag, this, "geo:0,0?q=23.719541,90.388099,lng(Lalbag Fort)?z=19"));

        Attractions.add(new Word(R.string.Attraction2, R.string.Attraction2desc, R.drawable.sonargaon, this, "geo:0,0?q=23.646095,90.599104,lng(Sonargaon)?z=19"));

        Attractions.add(new Word(R.string.Attraction3, R.string.Attraction3desc, R.drawable.ahsan, this, "geo:0,0?q=23.708596,90.406002,lng(Ahsan Manzil)?z=19"));

        Attractions.add(new Word(R.string.Attraction4, R.string.Attraction4desc, R.drawable.sangsad, this, "geo:0,0?q=23.762301,90.378749,lng(Sangsad bhaban)?z=19"));

        Attractions.add(new Word(R.string.Attraction5, R.string.Attraction5desc, R.drawable.srtiti, this, "geo:0,0?q=23.911216,90.254720,lng(Sriti Soudho)?z=19"));

        Attractions.add(new Word(R.string.Attraction6, R.string.Attraction6desc, R.drawable.museum, this, "geo:0,0?q=23.737480,90.394450,lng(National Museum)?z=19"));

        Attractions.add(new Word(R.string.Attraction7, R.string.Attraction7desc, R.drawable.sixtydome, this, "geo:0,0?q=22.674507,89.741836,lng(Sixty dome mosque)?z=19"));

        Attractions.add(new Word(R.string.Attraction8, R.string.Attraction8desc, R.drawable.zoo, this, "geo:0,0?q=23.814020,90.349097,lng(National Zoo)?z=19"));

        Attractions.add(new Word(R.string.Attraction9, R.string.Attraction9desc, R.drawable.minar, this, "geo:0,0?q=23.727243,90.396628,lng(Shaheed Minar)?z=19"));

        Attractions.add(new Word(R.string.Attraction10, R.string.Attraction10desc, R.drawable.ramna, this, "geo:0,0?q=23.737588,90.401290,lng(Ramna Park)?z=19"));

        Attractions.add(new Word(R.string.Attraction11, R.string.Attraction11desc, R.drawable.dhakeshwari, this, "geo:0,0?q=23.723101,90.390107,lng(Dhakeshwari)?z=19"));



        Collections.sort(Attractions);

        ListView listView = (ListView) findViewById(R.id.listView);

        final CustomArrayAdpater arrayAdpater = new CustomArrayAdpater(this, Attractions,R.color.Attractionmain);

        listView.setAdapter(arrayAdpater);


    }
    @Override
    public void onBackPressed() {
        AttractionActivity.this.finish();
    }
}
