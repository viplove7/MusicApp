package com.example.viplove.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class songadapter extends ArrayAdapter<song> {
    private int color;

    public songadapter(Context context, ArrayList<song> array, int mcolor) {
        super(context, 0, array);
        color = mcolor;

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        song currentsong = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);

        songTextView.setText(currentsong.getSongname());


        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);

        artistTextView.setText(currentsong.getArtist());
        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image);
        defaultImageView.setImageResource(currentsong.getImageid());

        View textcontainer = listItemView.findViewById(R.id.container);
        int Color = ContextCompat.getColor(getContext(), color);
        textcontainer.setBackgroundColor(Color);


        return listItemView;

    }
}
