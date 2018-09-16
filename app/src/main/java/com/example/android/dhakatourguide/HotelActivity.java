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

public class HotelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitems);

        ArrayList<Word> hotels = new ArrayList();

        hotels.add(new Word(R.string.Hotel1, R.string.Hotel1Location, R.drawable.amari,R.string.Hotel1link, this, "geo:0,0?q=23.790588,90.412638,lng(Amari)?z=19",true));

        hotels.add(new Word(R.string.Hotel2, R.string.Hotel2Location, R.drawable.sarina,R.string.Hotel2link, this, "geo:0,0?q=23.793340,90.404487,lng(Hotel Sarina)?z=19",true));

        hotels.add(new Word(R.string.Hotel3, R.string.Hotel3Location, R.drawable.thewestin,R.string.Hotel3link, this, "geo:0,0?q=23.793442,90.414224,lng(The Westin)?z=19",true));

        hotels.add(new Word(R.string.Hotel4, R.string.Hotel4Location, R.drawable.fourpoints,R.string.Hotel4link, this, "geo:0,0?q=23.792188,90.413339,lng(Four Points By Sheraton)?z=19",true));

        hotels.add(new Word(R.string.Hotel5, R.string.Hotel5Location, R.drawable.ascott,R.string.Hotel5link, this, "geo:0,0?q=23.803678,90.420190,lng(Ascott Palace Limited)?z=19",true));

        hotels.add(new Word(R.string.Hotel6, R.string.Hotel6Location, R.drawable.sixseasons,R.string.Hotel6link, this, "geo:0,0?q=23.794523,90.419615,lng(Six Seasons)?z=19",true));

        hotels.add(new Word(R.string.Hotel7, R.string.Hotel7Location, R.drawable.longbeachsuites,R.string.Hotel7link, this, "geo:0,0?q=23.789926,90.420301,lng(Long Beach Suites)?z=19",true));

        hotels.add(new Word(R.string.Hotel8, R.string.Hotel8Location, R.drawable.radissonblu,R.string.Hotel8link, this, "geo:0,0?q=23.816041,90.408720,lng(Radisson Blu Water Garden)?z=19",true));

        hotels.add(new Word(R.string.Hotel9, R.string.Hotel9Location, R.drawable.lemeredien,R.string.Hotel9link, this, "geo:0,0?q=23.836332,90.417711,lng(Le Meredian)?z=19",true));

        hotels.add(new Word(R.string.Hotel10, R.string.Hotel10Location, R.drawable.theway,R.string.Hotel10link, this, "geo:0,0?q=23.796812,90.411610,lng(THE WAY)?z=19",true));

        hotels.add(new Word(R.string.Hotel11, R.string.Hotel11Location, R.drawable.panpacific,R.string.Hotel11link, this, "geo:0,0?q=23.749581,90.394509,lng(Pan Pacific Sonargaon)?z=19",true));

        Collections.sort(hotels);

        ListView listView = (ListView) findViewById(R.id.listView);

        final CustomArrayAdpater arrayAdpater = new CustomArrayAdpater(this, hotels,R.color.Hotel);

        listView.setAdapter(arrayAdpater);


    }
    @Override
    public void onBackPressed() {
        HotelActivity.this.finish();
    }
}

