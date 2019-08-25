package com.example.robad.musicstructure;

public class Song {

    /*
    Create two private String variables.
     */
    private String mSongName;
    private String mSongArtist;

    /*
    Create a constructor that takes two String arguments songName & songArtist. Instantiate the
    private Strings with the input arguments.
     */
    Song(String songName, String songArtist){
            mSongName = songName;
            mSongArtist = songArtist;
    }

    /*
    Create two getter methods to retrieve mSongName & mSongArtist.
     */
    public String getSongName() {
        return mSongName;
    }

    public String getSongArtist() {
        return mSongArtist;
    }
}
