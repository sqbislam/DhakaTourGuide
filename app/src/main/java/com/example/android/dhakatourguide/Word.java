package com.example.android.dhakatourguide;


import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;

/**
 * Created by User on 8/30/2017.
 */

public class Word implements Comparable<Word>{
    private int name;
    private int description;
    private int imgID;
    private Context context;
    private Uri geoLocation;
    private int colorID;
    private boolean booked=false;
    private int link;


    public Word(int name, int description, int imgID, Context context, String geo) {
        this.name = name;
        this.description = description;
        this.imgID=imgID;
        this.context=context;
        geoLocation=Uri.parse(geo);


    }

    public Word(int name, int description, int imgID,int link, Context context,String geo,boolean booking) {
        this.name = name;
        this.description = description;
        this.imgID=imgID;
        this.context=context;
        geoLocation=Uri.parse(geo);
        this.booked=booking;
        this.link=link;

    }

    public int getLink() {
        return link;
    }

    public boolean isBooked() {
        return booked;
    }


    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getImgID() {
        return imgID;
    }

    public Uri getGeoLocation() {
        return geoLocation;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public int compareTo(@NonNull Word o) {
        String name1=context.getString(name);
        String name2= context.getString(o.getName());
        return name1.compareTo(name2);
    }
}
