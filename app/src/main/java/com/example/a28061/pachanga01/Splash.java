package com.example.a28061.pachanga01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    Splash thisActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        thisActivity = this;

        TimerTask cambio_pantalla = new TimerTask() {
            @Override
            public void run() {
                Intent cambio_intent= new Intent(thisActivity,Pantalla_seg.class);
                thisActivity.startActivity(cambio_intent);
                thisActivity.finish();
            }

        };
        Timer mi_primer_timer = new Timer();
        mi_primer_timer.schedule(cambio_pantalla,10000);

    }
    }

