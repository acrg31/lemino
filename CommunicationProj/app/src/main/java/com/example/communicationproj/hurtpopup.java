package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class hurtpopup extends AppCompatActivity {
    public MediaPlayer vmHurt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurtpopup);

        final LottieAnimationView lottiePain1 = findViewById(R.id.btnPain1);
        lottiePain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurt= MediaPlayer.create(hurtpopup.this,R.raw.pain1);
                vmHurt.start();
                finish();
                masakitv2(view);
                finish();
            }
        });

        final LottieAnimationView lottiebreathing = findViewById(R.id.btnbreathing);
        lottiebreathing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurt= MediaPlayer.create(hurtpopup.this,R.raw.breathing);
                vmHurt.start();
                finish();
                rate();
                finish();
            }
        });
        final LottieAnimationView lottiepain2 = findViewById(R.id.btndoesithurt);
        lottiepain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurt= MediaPlayer.create(hurtpopup.this,R.raw.hurt);
                vmHurt.start();
                finish();
                rate();
                finish();
            }
        });
        final LottieAnimationView lottiepain3 = findViewById(R.id.btnhurt3);
        lottiepain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlaying();
                vmHurt= MediaPlayer.create(hurtpopup.this,R.raw.wagmasakit);
                vmHurt.start();
                finish();
                rate();
                finish();
            }
        });
    }
    public void masakitv2(View view){

        if (view.getId()==R.id.btnPain1){

            startActivity(new Intent(this,hurtpopupv2.class));
        }
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
        if (vmHurt != null) {
            vmHurt.stop();
            vmHurt.release();
            vmHurt = null;
        }
    }
}