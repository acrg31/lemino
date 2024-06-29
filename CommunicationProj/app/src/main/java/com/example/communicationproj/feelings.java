package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class feelings extends AppCompatActivity {
    public MediaPlayer vmFeelings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings);

        final LottieAnimationView lottiecold = findViewById(R.id.btnCold);
        lottiecold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmFeelings= MediaPlayer.create(feelings.this,R.raw.cold);
                vmFeelings.start();

            }
        });

        final LottieAnimationView lottieHot = findViewById(R.id.btnHot);
        lottieHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmFeelings= MediaPlayer.create(feelings.this,R.raw.hot);
                vmFeelings.start();

            }
        });

        final LottieAnimationView lottieNervous = findViewById(R.id.btnNervous);
        lottieNervous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmFeelings= MediaPlayer.create(feelings.this,R.raw.nervous);
                vmFeelings.start();

            }
        });

        final LottieAnimationView lottieScared = findViewById(R.id.btnScared);
        lottieScared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmFeelings= MediaPlayer.create(feelings.this,R.raw.scared);
                vmFeelings.start();

            }
        });

    }


    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmFeelings != null) {
            vmFeelings.stop();
            vmFeelings.release();
            vmFeelings = null;
        }
    }
}