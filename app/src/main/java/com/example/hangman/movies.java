package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class movies extends AppCompatActivity {
    Button bollyMovies,hollyMovies,kollyMovies;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }
    public void set(View v){
        bollyMovies = findViewById(R.id.bollymovies);
        hollyMovies = findViewById(R.id.hollymovies);
        kollyMovies = findViewById(R.id.kollymovies);
        Button pressedButton = (Button) v;
        if (pressedButton == bollyMovies){
            id = 1;
        }
        else if (pressedButton == hollyMovies) {
            id = 2;
        }
        else if (pressedButton == kollyMovies){
            id = 3;
        }
        Intent i = new Intent(this,GamePage.class);
        i.putExtra("GameType",id);
        startActivity(i);
    }
}