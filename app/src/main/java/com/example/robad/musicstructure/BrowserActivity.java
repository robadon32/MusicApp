package com.example.robad.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser_activity);

        /*
        Find the button views in the browser_activity xml.
         */
        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        /*
        Make button clickable with setOnClickListener method and overriding the onClick method.
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BrowserActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BrowserActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
