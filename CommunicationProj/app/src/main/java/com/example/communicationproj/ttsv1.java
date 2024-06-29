package com.example.communicationproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;


public class ttsv1 extends AppCompatActivity {
    Button btnGenerate;
    EditText etText;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttsv1);
        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR)
                    t1.setLanguage(Locale.ENGLISH);

            }
        });

        btnGenerate = findViewById(R.id.btnttSpp);
        etText = findViewById(R.id.txtttsp);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textt= etText.getText().toString();
                t1.speak(textt,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }
}