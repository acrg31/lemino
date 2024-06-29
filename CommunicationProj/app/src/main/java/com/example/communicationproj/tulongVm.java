package com.example.communicationproj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


import com.airbnb.lottie.LottieAnimationView;

public class tulongVm extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulonglayout);


    }

    @Override
    protected void onResume() {
        super.onResume();

        final MediaPlayer vmHelps = MediaPlayer.create(this, R.raw.needhelp);
        final LottieAnimationView lottieTulongs = findViewById(R.id.btnNeedyourhelp);
        lottieTulongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vmHelps.start();
                tulongVMs();
            }
        });

    }

    public void tulongVMs() {

        dialogBuilder = new AlertDialog.Builder(this);
        final View TulongPopup = getLayoutInflater().inflate(R.layout.crpopup, null);

        dialogBuilder.setView(TulongPopup);
        dialog = dialogBuilder.create();
        dialog.show();
    }

}
