package com.example.Ahmed.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout playingNow=findViewById(R.id.playingNow);
        LinearLayout playlist=findViewById(R.id.playList);
        LinearLayout songs=findViewById(R.id.songs);


        playingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(intent);
            }
        });
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(intent);
            }
        });
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
