package com.example.ProyectoAndroidGrupo07UTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Metodo onCreate()", Toast.LENGTH_LONG).show();
        Log.i("Esto es una prueba", "Error");
    }
// Para llamar por un botón a la siguiente actividad

    public void goToActivity2(View view) {
        Intent newIntent = new Intent(this,SecondActivity.class);
        newIntent.putExtra("msg", "Hola Activity 2"); //Esto es para poner un mensaje
        newIntent.putExtra("msg", "Bienvenido");
        startActivity(newIntent);
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Metodo onStar()", Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Metodo onResume()", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Metodo onPause()", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Metodo onStop()", Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Metodo onRestart()", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("informacion","La actividad fue destruida");
        Toast.makeText(getApplicationContext(), "Metodo onDestroy()", Toast.LENGTH_LONG).show();
    }

}