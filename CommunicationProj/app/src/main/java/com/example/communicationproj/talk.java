package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class talk extends AppCompatActivity {
    public MediaPlayer vmTalk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);

        final LottieAnimationView lottieTalk = findViewById(R.id.btnTalk1);
        lottieTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk= MediaPlayer.create(talk.this,R.raw.talk1);
                vmTalk.start();
                finish();
                talkv2(view);
                finish();

            }
        });
        final LottieAnimationView lottieExplain = findViewById(R.id.btnExplain);
        lottieExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk= MediaPlayer.create(talk.this,R.raw.explain);
                vmTalk.start();

            }
        });
        final LottieAnimationView lottieNoisy = findViewById(R.id.btnShutup);
        lottieNoisy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmTalk= MediaPlayer.create(talk.this,R.raw.shutup);
                vmTalk.start();

            }
        });




    }
    public void talkv2(View view){

        if (view.getId()==R.id.btnTalk1){

            startActivity(new Intent(this,talkv2.class));
        }
    }
    @Override
    public void onBackPressed() {

        stopPlaying();
        finish();
    }
    private void stopPlaying() {
        if (vmTalk != null) {
            vmTalk.stop();
            vmTalk.release();
            vmTalk = null;
        }
    }
}