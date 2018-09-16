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

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitems);

        ArrayList<Word> shops = new ArrayList();


        shops.add(new Word(R.string.Shop1, R.string.Shop1Description, R.drawable.aarong, this, "geo:23.739034,90.383121?z=19"));

        shops.add(new Word(R.string.Shop2, R.string.Shop2Description, R.drawable.bashundharacity, this, "geo:23.751129,90.390852?z=19"));

        shops.add(new Word(R.string.Shop3, R.string.Shop3Description, R.drawable.jamunafuturepark, this, "geo:23.813567,90.424340?z=19"));

        shops.add(new Word(R.string.Shop4, R.string.Shop4Description, R.drawable.newmarket, this, "geo:23.733032,90.384684?z=19"));

        shops.add(new Word(R.string.Shop5, R.string.Shop5Description, R.drawable.bangshal, this, "geo:23.717487,90.406798?z=19"));

        shops.add(new Word(R.string.Shop6, R.string.Shop6Description, R.drawable.drik_gallery, this, "geo:23.752069,90.369887?z=19"));

        shops.add(new Word(R.string.Shop7, R.string.Shop7Description, R.drawable.bangabazar, this, "geo:23.723639,90.405874?z=19"));

        Collections.sort(shops);

        ListView listView = (ListView) findViewById(R.id.listView);

        final CustomArrayAdpater arrayAdpater = new CustomArrayAdpater(this, shops,R.color.Shopmain);

        listView.setAdapter(arrayAdpater);


    }

    @Override
    public void onBackPressed() {
        ShopActivity.this.finish();
    }
}
