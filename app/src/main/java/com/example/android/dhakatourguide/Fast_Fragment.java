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
public class Fast_Fragment extends Fragment {


    public Fast_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.listitems,container,false);

        ArrayList<Word> shops = new ArrayList();


        shops.add(new Word(R.string.Fast1, R.string.nullvalue, R.drawable.madchef, R.string.Fast1Link, getActivity(), "geo:23.739034,90.383121?z=19", false));

        shops.add(new Word(R.string.Fast2, R.string.nullvalue, R.drawable.takeout,R.string.Fast2Link, getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast3, R.string.nullvalue, R.drawable.chillox, R.string.Fast3Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast4, R.string.nullvalue, R.drawable.alfresco, R.string.Fast4Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast5, R.string.nullvalue, R.drawable.burgerking, R.string.Fast5Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast6, R.string.nullvalue, R.drawable.chefscusine,R.string.Fast6Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast7, R.string.nullvalue, R.drawable.gloria, R.string.Fast7Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));


        shops.add(new Word(R.string.Fast8, R.string.nullvalue, R.drawable.star, R.string.Fast8Link, getActivity(), "geo:23.739034,90.383121?z=19", false));

        shops.add(new Word(R.string.Fast9, R.string.nullvalue, R.drawable.livekitchen,R.string.Fast9Link, getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast10, R.string.nullvalue, R.drawable.pimiento, R.string.Fast10Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast11, R.string.nullvalue, R.drawable.pitgrill, R.string.Fast11Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast12, R.string.nullvalue, R.drawable.khanas, R.string.Fast12Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast13, R.string.nullvalue, R.drawable.tastebud,R.string.Fast13Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast14, R.string.nullvalue, R.drawable.crimson, R.string.Fast14Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast15, R.string.nullvalue, R.drawable.pizzaguy, R.string.Fast11Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast16, R.string.nullvalue, R.drawable.droom, R.string.Fast12Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));

        shops.add(new Word(R.string.Fast17, R.string.nullvalue, R.drawable.subfactory,R.string.Fast13Link ,getActivity(), "geo:23.751129,90.390852?z=19",false));


        Collections.sort(shops);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        final CustomArrayAdpater arrayAdpater = new CustomArrayAdpater(getActivity(), shops,R.color.Food);

        listView.setAdapter(arrayAdpater);

        return rootView;
    }

}
