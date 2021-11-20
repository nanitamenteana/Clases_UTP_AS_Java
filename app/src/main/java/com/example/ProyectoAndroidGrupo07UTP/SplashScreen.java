package com.example.ProyectoAndroidGrupo07UTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    //Constante para el temporizador
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Bloquear rotación de pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Ocultar la barra de notificaciones
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_splashs_screen);
        //Ocultar ActionBar
        getSupportActionBar().hide();

        //Crear tarea de temporizador
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run(){
                Intent newIntent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(newIntent);
                finish();

            }

        };

        //Creación de objeto para el lanzamiento del temporizador.
        Timer timer = new Timer();
        timer.schedule(timerTask, SPLASH_SCREEN_DELAY);

    }
}

