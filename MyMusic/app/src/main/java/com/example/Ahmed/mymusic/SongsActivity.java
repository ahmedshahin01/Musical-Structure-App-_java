package com.example.Ahmed.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_);


        Button playingBTN=findViewById(R.id.playingBTN);
        Button playListBTN=findViewById(R.id.playListBTN);
        LinearLayout song1=findViewById(R.id.song1);

        playingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, PlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
        playListBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, PlayListActivity.class);
                startActivity(intent);
                finish();
            }
        });
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, PlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
