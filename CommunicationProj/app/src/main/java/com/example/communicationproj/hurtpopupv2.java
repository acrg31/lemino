package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class hurtpopupv2 extends AppCompatActivity {
    public MediaPlayer vmHurtv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurtpopupv2);

        final LottieAnimationView lottieulo = findViewById(R.id.btnUlo);
        lottieulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.ulo);
                vmHurtv2.start();
                finish();
                rate();
                finish();

            }
        });
        final LottieAnimationView lottiePaa = findViewById(R.id.btnPaa);
        lottiePaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.paa);
                vmHurtv2.start();
                finish();
                rate();
                finish();

            }
        });
        final LottieAnimationView lottiekamay = findViewById(R.id.btnKamay);
        lottiekamay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.kamay);
                vmHurtv2.start();
                finish();
                rate();
                finish();

            }
        });
        final LottieAnimationView lottiengipin = findViewById(R.id.btnNgipin);
        lottiengipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.ngipin);
                vmHurtv2.start();
                finish();
                rate();
                finish();

            }
        });
        final LottieAnimationView lottiemata = findViewById(R.id.btnMata);
        lottiemata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.mata);
                vmHurtv2.start();

                finish();
                rate();
                finish();
            }
        });
        final LottieAnimationView lottietiyan = findViewById(R.id.btnTiyan);
        lottietiyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.tiyan);
                vmHurtv2.start();

                finish();
                rate();
                finish();
            }
        });
        final LottieAnimationView lottiedibdib = findViewById(R.id.btnDibdib);
        lottiedibdib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurtv2= MediaPlayer.create(hurtpopupv2.this,R.raw.dibdib);
                vmHurtv2.start();
                finish();
                rate();
                finish();

            }
        });


    }

    public void rate(){

            startActivity(new Intent(this,ratepain.class));

    }
    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmHurtv2 != null) {
            vmHurtv2.stop();
            vmHurtv2.release();
            vmHurtv2 = null;
        }
    }

}