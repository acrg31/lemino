package com.example.communicationproj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class buttonWords extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_words);


    }


    @Override
    protected void onResume() {
        super.onResume();

        final MediaPlayer vmHelp = MediaPlayer.create(this, R.raw.click);
        final LottieAnimationView lottieTulong = findViewById(R.id.btnHelp);
        lottieTulong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmHelp.start();
                tulongv2(view);

            }
        });


        final MediaPlayer vmcr = MediaPlayer.create(this, R.raw.click);
        final LottieAnimationView lottieCR = findViewById(R.id.btnToilet);
        lottieCR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmcr.start();
                crv2(view);

            }
        });


        final MediaPlayer vmpain = MediaPlayer.create(this, R.raw.click);
        final LottieAnimationView lottiePain = findViewById(R.id.btnPain);
        lottiePain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmpain.start();
                painv2(view);

            }
        });


        final MediaPlayer vmtalk = MediaPlayer.create(this, R.raw.click);
        final LottieAnimationView lottieTalk = findViewById(R.id.btnTalk);
        lottieTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmtalk.start();
                talkv2(view);
            }

        });


        final MediaPlayer vmFeelings = MediaPlayer.create(this, R.raw.click);
        final LottieAnimationView lottieFeeling = findViewById(R.id.btnFeelings);
        lottieFeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmFeelings.start();
                feelingsv2(view);
            }
        });

    }

    public void tulongv2(View view) {

        if (view.getId() == R.id.btnHelp) {

            startActivity(new Intent(this, needhelpPopup.class));
        }
    }

    public void crv2(View view) {

        if (view.getId() == R.id.btnToilet) {

            startActivity(new Intent(this, cr.class));
        }
    }

    public void painv2(View view) {

        if (view.getId() == R.id.btnPain) {

            startActivity(new Intent(this, hurtpopup.class));
        }
    }
    public void talkv2(View view) {

        if (view.getId() == R.id.btnTalk) {

            startActivity(new Intent(this, talk.class));
        }
    }
    public void feelingsv2(View view) {

        if (view.getId() == R.id.btnFeelings) {

            startActivity(new Intent(this, feelings.class));
        }
    }


}