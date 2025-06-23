package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class celebs extends AppCompatActivity {
    Button bollyStars,hollyStars,kollyStars;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebs);
    }
    public void set(View v){
        bollyStars = findViewById(R.id.bollystars);
        hollyStars = findViewById(R.id.hollystars);
        kollyStars = findViewById(R.id.kollystars);
        Button pressedButton = (Button) v;
        if (pressedButton == bollyStars){
            id = 7;
        }
        else if (pressedButton == hollyStars) {
            id = 8;
        }
        else if (pressedButton == kollyStars){
            id = 9;
        }
        Intent i = new Intent(this,GamePage.class);
        i.putExtra("GameType",id);
        startActivity(i);
    }
}