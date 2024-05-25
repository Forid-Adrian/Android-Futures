package com.home.myapplication;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imgplay1;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imgplay1 = findViewById(R.id.imgplay1);

        imgplay1.setOnClickListener(v -> {

            if (imgplay1.getTag()!=null && imgplay1.getTag().toString().contains("notPlaying")){

                if (mediaPlayer!=null)mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.faded);
                mediaPlayer.start();
                imgplay1.setImageResource(R.drawable.baseline_stop_24);
                imgplay1.setTag("Playing");

            }else {
                if (mediaPlayer!=null)mediaPlayer.release();
                imgplay1.setImageResource(R.drawable.baseline_play_arrow_24);
                imgplay1.setTag("notPlaying");
            }
        });







    }
}