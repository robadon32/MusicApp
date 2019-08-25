package com.example.robad.musicstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /*
    Create a constructor that takes two arguments context & ArrayLIst<Song>. Have the constructor
    call the Superclass Constructor.
     */
    SongAdapter(Activity context, ArrayList<Song> song){

        super(context,0, song);
    }

    /*
    Override the ArrayAdapter getView method to display two TextViews and inflate the songName &
    songArtist TextViews with the ArrayList items using the setText method and pass it the getter
    method as an input.

     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);

        }
        Song currentSong = getItem(position);

        TextView songName = listItemView.findViewById(R.id.song_name_textview);
        assert currentSong != null;
        songName.setText(currentSong.getSongName());

        TextView songArtist = listItemView.findViewById(R.id.song_artist_textview);
        songArtist.setText(currentSong.getSongArtist());

        return listItemView;

    }
}
