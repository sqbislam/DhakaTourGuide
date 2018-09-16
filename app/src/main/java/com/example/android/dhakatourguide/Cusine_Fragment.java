package com.example.android.dhakatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cusine_Fragment extends Fragment {


    public Cusine_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.listitems,container,false);
        ArrayList<Word> shops = new ArrayList();


        shops.add(new Word(R.string.Cusine1, R.string.Cuisine1Style, R.drawable.nandos,R.string.Cusine1Link, getActivity(), "geo:23.739034,90.383121?z=19",false));

        shops.add(new Word(R.string.Cusine2, R.string.Cuisine2Style, R.drawable.santoor,R.string.Cusine2Link, getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Cusine3, R.string.Cuisine3Style, R.drawable.diningroom,R.string.Cusine3Link, getActivity(), "geo:23.813567,90.424340?z=19",false));

        shops.add(new Word(R.string.Cusine4, R.string.Cuisine4Style, R.drawable.bbqbangladesh,R.string.Cusine4Link, getActivity(), "geo:23.733032,90.384684?z=19",false));

        shops.add(new Word(R.string.Cusine5, R.string.Cuisine5Style, R.drawable.barbqtonight,R.string.Cusine5Link, getActivity(), "geo:23.717487,90.406798?z=19",false));

        shops.add(new Word(R.string.Cusine6, R.string.Cuisine6Style, R.drawable.greatkababfactory,R.string.Cusine6Link, getActivity(), "geo:23.752069,90.369887?z=19",false));

        shops.add(new Word(R.string.Cusine7, R.string.Cuisine7Style, R.drawable.hakkadhaka,R.string.Cusine7Link, getActivity(), "geo:23.723639,90.405874?z=19",false));

        shops.add(new Word(R.string.Cusine8, R.string.Cuisine8Style, R.drawable.flavorsofchina,R.string.Cusine8Link, getActivity(), "geo:23.739034,90.383121?z=19",false));

        shops.add(new Word(R.string.Cusine9, R.string.Cuisine9Style, R.drawable.batonrouge,R.string.Cusine9Link, getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Cusine10, R.string.Cuisine10Style, R.drawable.tarka,R.string.Cusine10Link, getActivity(), "geo:23.813567,90.424340?z=19",false));

        shops.add(new Word(R.string.Cusine11, R.string.Cuisine11Style, R.drawable.alchemy,R.string.Cusine11Link, getActivity(), "geo:23.733032,90.384684?z=19",false));

        shops.add(new Word(R.string.Cusine12, R.string.Cuisine12Style, R.drawable.bistroe,R.string.Cusine12Link, getActivity(), "geo:23.717487,90.406798?z=19",false));

        shops.add(new Word(R.string.Cusine13, R.string.Cuisine13Style, R.drawable.laketerrace,R.string.Cusine13Link, getActivity(), "geo:23.752069,90.369887?z=19",false));

        shops.add(new Word(R.string.Cusine14, R.string.Cuisine14Style, R.drawable.meraki,R.string.Cusine14Link, getActivity(), "geo:23.723639,90.405874?z=19",false));

        shops.add(new Word(R.string.Cusine15, R.string.Cuisine15Style, R.drawable.platter,R.string.Cusine15Link, getActivity(), "geo:23.739034,90.383121?z=19",false));

        shops.add(new Word(R.string.Cusine16, R.string.Cuisine16Style, R.drawable.glasshouseb,R.string.Cusine16Link, getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Cusine17, R.string.Cuisine17Style, R.drawable.watercress,R.string.Cusine17Link, getActivity(), "geo:23.813567,90.424340?z=19",false));

        shops.add(new Word(R.string.Cusine18, R.string.Cuisine18Style, R.drawable.umai,R.string.Cusine18Link, getActivity(), "geo:23.733032,90.384684?z=19",false));

        shops.add(new Word(R.string.Cusine19, R.string.Cuisine19Style, R.drawable.tokyoexpress,R.string.Cusine19Link, getActivity(), "geo:23.733032,90.384684?z=19",false));

        Collections.sort(shops);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        final CustomArrayAdpater arrayAdpater = new CustomArrayAdpater(getActivity(), shops,R.color.Food);

        listView.setAdapter(arrayAdpater);

        return rootView;
    }
}
