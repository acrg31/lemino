package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class needhelpPopup extends AppCompatActivity {
   public MediaPlayer vmHelps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needhelp_popup);


        final LottieAnimationView lottieTulongs = findViewById(R.id.btnNeedyourhelp);
        lottieTulongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHelps= MediaPlayer.create(needhelpPopup.this,R.raw.tulong);
                vmHelps.start();

            }
        });
        final LottieAnimationView lottiePosition = findViewById(R.id.btncomfortable);
        lottiePosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHelps= MediaPlayer.create(needhelpPopup.this,R.raw.pwesto);
                vmHelps.start();

            }
        });

    }
    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmHelps != null) {
            vmHelps.stop();
            vmHelps.release();
            vmHelps = null;
        }
    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        final MediaPlayer vmHelps;
//
//        final LottieAnimationView lottieTulongs = findViewById(R.id.btnNeedyourhelp);
//        lottieTulongs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////              vmHelps= MediaPlayer.create(needhelpPopup.this,R.raw.tulong);
////              vmHelps.start();
//
//            }
//        });
//
//        final MediaPlayer vmPostion = MediaPlayer.create(this, R.raw.pwesto);
//        final LottieAnimationView lottiePosition = findViewById(R.id.btncomfortable);
//        lottiePosition.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                vmPostion.start();
//
//            }
//        });
//
//    }
}