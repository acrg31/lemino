package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonWords,ttps;
    static MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        final MediaPlayer mp= MediaPlayer.create(this, R.raw.click);
        buttonWords=(Button) findViewById(R.id.textButton);
        buttonWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();;
                startActivity( new Intent(MainActivity.this, buttonWords.class));
            }
        });
        final MediaPlayer ttp= MediaPlayer.create(this, R.raw.click);
        ttps=(Button) findViewById(R.id.text2Speech);
        ttps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ttp.start();;
                startActivity( new Intent(MainActivity.this, ttsv1.class));
            }
        });


    }


}