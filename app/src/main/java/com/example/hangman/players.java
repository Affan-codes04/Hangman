package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class players extends AppCompatActivity {
    Button cricPlayer;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
    }
    public void set(View v){
        cricPlayer = findViewById(R.id.cricPlayers);
        Button pressedButton = (Button) v;
        if (pressedButton == cricPlayer){
            id = 10;
        }

        Intent i = new Intent(this,GamePage.class);
        i.putExtra("GameType",id);
        startActivity(i);
    }
}