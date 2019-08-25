package com.example.robad.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_list);

        /*
        Find the button views in the library_list xml.
         */
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        /*
        Create a new Song ArrayList
         */
        ArrayList<Song> songs = new ArrayList<>();

        /*
        Use add method to add new songs to ArrayList<Song>. Each Song object takes two arguments
        songName & songArtist.
         */
        songs.add(new Song(getString(R.string.song_one_name), getString(R.string.song_one_artist)));
        songs.add(new Song(getString(R.string.song_two_name), getString(R.string.song_two_artist)));
        songs.add(new Song(getString(R.string.song_three_name), getString(R.string.song_three_artist)));
        songs.add(new Song(getString(R.string.song_four_name), getString(R.string.song_four_artist)));
        songs.add(new Song(getString(R.string.song_five_name), getString(R.string.song_five_artist)));
        songs.add(new Song(getString(R.string.song_six_song), getString(R.string.song_six_artist)));
        songs.add(new Song("Taste(feat. Offset)", getString(R.string.song_seven_artist)));
        songs.add(new Song("Watch (feat. Lil Uzi Vert & Kanye West", getString(R.string.song_eight_artist)));
        songs.add(new Song("1942", "G-Easy, Yo Gotti, YBN Nahmir"));
        songs.add(new Song("Loook Alive(feat.Drake)", "BlockBoy JB"));
        songs.add(new Song("If You Know You Know", "Pusha T"));
        songs.add(new Song("Walk It Talk It","Migos, Drake"));
        songs.add(new Song("Big Bank (feat. 2 Chainz, Big Sean, Nicki Minaj)", "YG"));
        songs.add(new Song("Clout (feat. 21 Savage)", "Ty Dolla $ign"));
        songs.add(new Song("Lucid Dreams", "Juice WRLD"));
        songs.add(new Song("Spoil My Night (feat. Swae Lee)", "Post Malone"));
        songs.add(new Song("Plug Walk", "Rich The Kid"));
        songs.add(new Song("Ball For Me (feat. Nicki Minaj)", "Post Malone"));
        songs.add(new Song("This Is America", "Childish Gambino"));
        songs.add(new Song("Champion (feat. Travis Scott)","NAV"));
        songs.add(new Song("Ric Flair Drip (& Metro Boomin)","Offset, Metro Boomin"));
        songs.add(new Song("Bubblin", "Anderson .Peak"));
        songs.add(new Song("Powerglide (feat. Juicy J)", "Rae Sremmurd"));
        songs.add(new Song("Japan", "Famous Dex"));
        songs.add(new Song("Outside Today", "YoungBoy Never Broke Again"));
        songs.add(new Song("Creeping (feat. Rich The Kid)", "Lil Skies"));
        songs.add(new Song("KOD", "J. Cole"));
        songs.add(new Song("All Girls Are The Same", "Juice WRLD"));
        songs.add(new Song("Freestyle", "Lil Baby"));
        songs.add(new Song("God's Plan", "Drake"));
        songs.add(new Song("Eskeetit", "Lil Pump"));
        songs.add(new Song("Jettskie Grizzley (feat. Lil Pump)", "Tee Grizzley"));
        songs.add(new Song("Life Goes On", "Lil Baby, Gunna, Lil Uzi Vert"));
        songs.add(new Song("Buck Shots", "A&AP Rocky"));
        songs.add(new Song("2 Vaults (feat. Lil Yachty)", "Tee Grizzley"));
        songs.add(new Song("CLOSE (feat. Travis Scott)", "Rae Sremmurd"));
        songs.add(new Song("Motiv8", "J. Cole"));
        songs.add(new Song("What Would Meek Do", "Pusha T, Kanye West"));
        songs.add(new Song("Guatemala", "feat. Slim Jxmmi"));
        songs.add(new Song("Pineapple (feat. Gucci Mane & Quavo", "Ty Dolla $ign"));
        songs.add(new Song("Real Rich (feat. Gucci Mane)", "Whiz Khalifa"));
        songs.add(new Song("Change Lanes", "Kevin Gates"));
        songs.add(new Song("Aries(YuGo) Part 2 (feat. Rae Sremmurd)", "Mike WiLL Made-It"));
        songs.add(new Song("Love Hurts (feat. Travis Scott)", "Playboi Carti"));
        songs.add(new Song("Bad Company", "A$AP Rocky, BlockBoy JB"));
        songs.add(new Song("End Of Discussion (feat. Lil Wayne)", "Rich The Kid"));
        songs.add(new Song("WIN","Jay Rock"));
        songs.add(new Song("What You Want", "Belly, The Weeknd"));


        /*
        Create a new SongAdapter object that takes two arguments context & ArrayList<Song>.
         */
       Adapter adapter = new SongAdapter(this, songs);
//        SongAdapter adapter = new SongAdapter(this, songs);

        /*
        Find the ListView view.
         */
        final ListView listView = findViewById(R.id.list);

        /*
        Make item in the ListView clickable with setOnClickListener method and overriding the
        onClick method. Create a new Intent to start PlayerActivity when user clicks on an item.
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LibraryActivity.this, PlayerActivity.class);
                startActivity(intent);

            }
        });

        /*
        Set the SongAdapter on the ListView.
         */
        listView.setAdapter((ListAdapter) adapter);

        /*
        Make button clickable with setOnClickListener method and overriding the onClick method.
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LibraryActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LibraryActivity.this, BrowserActivity.class);
                startActivity(intent);
            }
        });
    }
}
