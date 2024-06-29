package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class cr extends AppCompatActivity {
    public MediaPlayer vmCR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr);


        final LottieAnimationView lottiePoop = findViewById(R.id.btnPoop);
        lottiePoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmCR= MediaPlayer.create(cr.this,R.raw.napadumi);
                vmCR.start();

            }
        });
        final LottieAnimationView lottiePee = findViewById(R.id.btnPee);
        lottiePee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmCR= MediaPlayer.create(cr.this,R.raw.napaihi);
                vmCR.start();

            }
        });
        final LottieAnimationView lottieCleanup = findViewById(R.id.btnCleanup);
        lottieCleanup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmCR= MediaPlayer.create(cr.this,R.raw.cleanupwav);
                vmCR.start();

            }
        });

    }
    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmCR != null) {
            vmCR.stop();
            vmCR.release();
            vmCR = null;
        }
    }
}