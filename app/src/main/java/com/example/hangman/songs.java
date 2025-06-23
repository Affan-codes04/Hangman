package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class songs extends AppCompatActivity {
    Button bollySongs,hollySongs,kollySongs;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
    }
    public void set(View v){
        bollySongs = findViewById(R.id.bollysongs);
        hollySongs = findViewById(R.id.hollysongs);
        kollySongs = findViewById(R.id.kollysongs);
        Button pressedButton = (Button) v;
        if (pressedButton == bollySongs){
            id = 4;
        }
        else if (pressedButton == hollySongs) {
            id = 5;
        }
        else if (pressedButton == kollySongs){
            id = 6;
        }
        Intent i = new Intent(this,GamePage.class);
        i.putExtra("GameType",id);
        startActivity(i);
    }
}