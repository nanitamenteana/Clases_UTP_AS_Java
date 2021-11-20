package com.example.ProyectoAndroidGrupo07UTP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //Variables para todos los metodos
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Ocultar ActionBar
        getSupportActionBar().hide();
        //Variables a encontrar
        et1 = (EditText) findViewById(R.id.usuariohint);
        et2 = (EditText) findViewById(R.id.contraseñahint);
    }
//Metodo para tomar los datos proporcionados en el login
    public void login(View view){
        //Asegurarse que el usuario escribio algo
        String user = et1.getText().toString();





    }
}

