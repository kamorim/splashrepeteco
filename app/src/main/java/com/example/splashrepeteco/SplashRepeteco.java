package com.example.splashrepeteco.;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.splashrepeteco.MainActivity;
import com.example.splashrepeteco.SplashRepetecoJava;

public class SplashRepeteco extends Activity {
    // Timer da splash screen
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.splashscreen.R.layout.activity_splash_repeteco);
        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um timer.
             */
            @Override
            public void run() {
// Esse método será executado sempre que o timer acabar
// E inicia a activity principal
                Intent i = new Intent(SplashRepeteco.this,
                        MainActivity.class);
                startActivity(i);
// Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}