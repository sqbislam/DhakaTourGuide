package com.example.android.dhakatourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 8/31/2017.
 */

public class CustomArrayAdpater extends ArrayAdapter<Word> {
int color_ID;
    CustomArrayAdpater(Context context, ArrayList<Word> words, int color){

        super(context,0,words);
        this.color_ID=color;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        final Word word = getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);

        }
        TextView name=(TextView) convertView.findViewById(R.id.name_textView);
        TextView description=(TextView) convertView.findViewById(R.id.description_textView);
        ImageView image=(ImageView) convertView.findViewById(R.id.list_image);

        name.setText(word.getName());
        description.setText(word.getDescription());
        image.setImageResource(word.getImgID());

        ImageButton button= (ImageButton)convertView.findViewById(R.id.location_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent show = new Intent(Intent.ACTION_VIEW);
                show.setData(word.getGeoLocation());
                parent.getContext().startActivity(show);
            }
        });

        ImageButton fbButton= (ImageButton)convertView.findViewById(R.id.fbButtom);

        Log.v(getContext().toString(),getContext().getClass().getSimpleName());



        if(getContext().getClass().getSimpleName().equalsIgnoreCase("FoodActivity")){
            button.setVisibility(View.GONE);
            fbButton.setVisibility(View.VISIBLE);
            fbButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent web=new Intent(Intent.ACTION_VIEW);
                    String string=getContext().getString(word.getLink());
                    web.setData(Uri.parse(string));
                    getContext().startActivity(web);
                }
            });
        }

        else{fbButton.setVisibility(View.GONE);}

        View back= convertView.findViewById(R.id.color_layout1);
        back.setBackgroundColor(ContextCompat.getColor(getContext(),color_ID));
        View backimg= convertView.findViewById(R.id.list_image);
        backimg.setBackgroundColor(ContextCompat.getColor(getContext(),color_ID));

        Button book = (Button) convertView.findViewById(R.id.bookButton);

        if(word.isBooked()==true) {
            book.setVisibility(View.VISIBLE);
            book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent web=new Intent(Intent.ACTION_VIEW);
                    String string=getContext().getString(word.getLink());
                    web.setData(Uri.parse(string));
                    getContext().startActivity(web);
                }
            });
        }

        else {book.setVisibility(View.GONE);}


        return convertView;

    }
}
