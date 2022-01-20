package com.example.Ahmed.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_activity);
        Button plyListBTN=findViewById(R.id.playListBTN);
        Button songsBTN=findViewById(R.id.songsBTN);

        plyListBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(PlayingActivity.this, PlayListActivity.class);
            startActivity(intent);
            finish();
        }
    });
        songsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingActivity.this, SongsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ArrayList<song> songs=new ArrayList<>();
        songs.add(new song("song1Name","s1Artest"));
        songs.add(new song("song2Name","s2Artest"));
        SongAdapter adapter=new SongAdapter(this,songs);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
