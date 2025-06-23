package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class mode_page_1 extends AppCompatActivity {
    Button movies,songs,celebrities,sportPlayers;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_page1);
    }
    public void set(View v){
        movies = findViewById(R.id.movies);
        songs = findViewById(R.id.songs);
        sportPlayers = findViewById(R.id.players);
        celebrities = findViewById(R.id.stars);
        Button pressedButton = (Button) v;
        if (pressedButton == movies){
            id = 1;
        }
        else if (pressedButton == songs) {
            id = 2;
        }
        else if (pressedButton == sportPlayers){
            id = 3;
        }
        else if (pressedButton == celebrities){
            id = 4;
        }
        Intent i = new Intent(this,movies.class);
        i.putExtra("GameType",id);
        startActivity(i);
    }
    public void movies(View v){
        Intent i = new Intent(this,movies.class);
        startActivity(i);
    }
    public void songs(View v){
        Intent i = new Intent(this,songs.class);
        startActivity(i);
    }
    public void celebs(View v){
        Intent i = new Intent(this,celebs.class);
        startActivity(i);
    }
    public void players(View v){
        Intent i = new Intent(this,players.class);
        startActivity(i);
    }

}