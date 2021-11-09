package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(getApplicationContext(),"Metodo OnCreate",Toast.LENGTH_SHORT).show();
        getExtras();
    }

    public void getExtras() {
        Bundle extras = getIntent().getExtras(); //Esta variable recibe los valores de la otra activity
        String msg = extras.getString("msg"); //Almacena lo que viene en extras
        String saludo = extras.getString("saludo");
        Toast.makeText(this,  msg + ", " + "saludo", Toast.LENGTH_SHORT).show(); //Muestra lo anterior
        Log.i("Información",msg + ", " + saludo);
    }

    // Para llamar por un botón a la siguiente actividad

    public void goToActivityMain(View view) {
        Intent newIntent = new Intent(this,MainActivity.class);
        startActivity(newIntent);
    }
}