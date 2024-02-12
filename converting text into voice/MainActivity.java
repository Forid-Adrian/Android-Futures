package com.home.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    TextToSpeech textToSpeech;

    @SuppressLint({"MissingInflatedId", "NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        button.setOnClickListener(v -> {
            if (editText.getText().toString().length()>0){
                textToSpeech.speak(""+editText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);
            }else {
                editText.setError("Please write anythings");

            }

        });



    }
}