package com.example.Ahmed.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        Button playinBTN=findViewById(R.id.playingBTN);
        Button songs=findViewById(R.id.songsBTN);
        LinearLayout PlayList=findViewById(R.id.playList1);

        playinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayListActivity.this, PlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayListActivity.this, SongsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        PlayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayListActivity.this, PlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
