package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class talkv2 extends AppCompatActivity {

    public MediaPlayer vmTalk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talkv2);

        final LottieAnimationView lottieAnak = findViewById(R.id.btnAnak);
        lottieAnak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk2= MediaPlayer.create(talkv2.this,R.raw.anak);
                vmTalk2.start();

            }
        });
        final LottieAnimationView lottieAsawa = findViewById(R.id.btnAsawa);
        lottieAsawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk2= MediaPlayer.create(talkv2.this,R.raw.asawa);
                vmTalk2.start();

            }
        });
        final LottieAnimationView lottieKapatid = findViewById(R.id.btnKapatid);
        lottieKapatid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk2= MediaPlayer.create(talkv2.this,R.raw.kapatid);
                vmTalk2.start();

            }
        });
        final LottieAnimationView lottieKamaganak = findViewById(R.id.btnKamaganak);
        lottieKamaganak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk2= MediaPlayer.create(talkv2.this,R.raw.kamaganak);
                vmTalk2.start();

            }
        });
        final LottieAnimationView lottieKaibigan = findViewById(R.id.btnKaibigan);
        lottieKaibigan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk2= MediaPlayer.create(talkv2.this,R.raw.kaibigan);
                vmTalk2.start();

            }
        });

    }
    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmTalk2 != null) {
            vmTalk2.stop();
            vmTalk2.release();
            vmTalk2 = null;
        }
    }
}