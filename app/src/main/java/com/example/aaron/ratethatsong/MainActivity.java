package com.example.aaron.ratethatsong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    MediaPlayer mpApollo, mpDilla, mpJayz;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button1.setOnClickListener(bApollo);
        button2.setOnClickListener(bDilla);
        button3.setOnClickListener(bJayz);
        mpApollo = new MediaPlayer();
        mpApollo = MediaPlayer.create(this, R.raw.aplollobrown);
        mpDilla = new MediaPlayer();
        mpDilla = MediaPlayer.create(this, R.raw.jdilla);
        mpJayz = new MediaPlayer();
        mpJayz = MediaPlayer.create(this, R.raw.djpremierjayz);
        playing = 0;
    }
    Button.OnClickListener bApollo = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpApollo.start();
                    playing = 1;
                    button1.setText("Pause Song");

                    break;
                case 1:
                    mpApollo.pause();
                    playing = 0;
                    button1.setText("Play Song");

                    break;
            }
        }
    };
    Button.OnClickListener bDilla = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpDilla.start();
                    playing = 1;
                    button2.setText("Pause Song");

                    break;
                case 1:
                    mpDilla.pause();
                    playing = 0;
                    button2.setText("Play Song");

                    break;
            }
        }
    };
    Button.OnClickListener bJayz = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpJayz.start();
                    playing = 1;
                    button3.setText("Pause Song");

                    break;
                case 1:
                    mpJayz.pause();
                    playing = 0;
                    button3.setText("Play Song");

                    break;
            }
        }
    };

}
