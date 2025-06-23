package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    Animation anim;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gamePage();
            }
        });

    }
    public void start(){
        im = findViewById(R.id.imid);

        ib = findViewById(R.id.btnim);
        anim = AnimationUtils.loadAnimation(this,R.anim.scale_hangman);
        im.startAnimation(anim);
        ib.startAnimation(anim);
    }

    public void gamePage(){
        Intent i = new Intent(this,mode_page_1.class);
        startActivity(i);
    }
}