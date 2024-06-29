package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class ratepain extends AppCompatActivity {

    public MediaPlayer vmRatePain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratepain);

        final LottieAnimationView lottieulo = findViewById(R.id.btnone);
        lottieulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.one);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottietwo = findViewById(R.id.btnTwo);
        lottietwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.dalawa);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottiethree = findViewById(R.id.btnThree);
        lottiethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.tatlo);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottiefour = findViewById(R.id.btnFour);
        lottiefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.apat);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottiefive = findViewById(R.id.btnFive);
        lottiefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.lima);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottiesix = findViewById(R.id.btnSix);
        lottiesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.anim);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottieseven = findViewById(R.id.btnSeven);
        lottieseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.pita);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottieeight = findViewById(R.id.btnEight);
        lottieeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.walo);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottienine = findViewById(R.id.btnNine);
        lottienine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.syam);
                vmRatePain.start();

            }
        });
        final LottieAnimationView lottiesampu = findViewById(R.id.btnTen);
        lottiesampu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmRatePain= MediaPlayer.create(ratepain.this,R.raw.sampu);
                vmRatePain.start();

            }
        });
    }

    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmRatePain != null) {
            vmRatePain.stop();
            vmRatePain.release();
            vmRatePain = null;
        }
    }
}