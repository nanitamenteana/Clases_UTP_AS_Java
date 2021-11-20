package com.example.ProyectoAndroidGrupo07UTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //Variables para todos los metodos
    EditText et1, et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Ocultar ActionBar
        getSupportActionBar().hide();
        //Variables de usuario y contraseña
        et1 = (EditText) findViewById(R.id.usuariohint);
        et2 = (EditText) findViewById(R.id.contraseñahint);
        //Variable de Recordar contraseña
        tv1 = (TextView) findViewById(R.id.textView5);
        tv1.setClickable(true);
        tv1.setLinkTextColor(Color.BLUE);
        String texto = "<a href=''>Recordar contraseña</a>";
        tv1.setText(Html.fromHtml(texto));
        //Estos valores son fijos pero podrian ir asociados a una base de datos
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (et1.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Su contraseña es: admin", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Su contraseña es: admin", Toast.LENGTH_SHORT).show();
                }
        });

    }
//Metodo para tomar los datos proporcionados en el login
    public void login(View view){
        //Asegurarse que el usuario escribio algo
        String user = et1.getText().toString();
        String pass = et2.getText().toString();
        if(!user.equals("") && !pass.equals("")){
            if(user.equals("admin") && pass.equals("admin")){
                Intent newIntent = new Intent(this, MainActivity.class);
                startActivity(newIntent);
                finish();
            }
            else {
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                et1.requestFocus();
            }
        }
        else {
            if(user.equals("")){
                et1.requestFocus();
                Toast.makeText(this, "Por favor,ingrese datos",Toast.LENGTH_SHORT).show();
            }
            else if (pass.equals("")){
                et2.requestFocus();
                Toast.makeText(this,"Por favor,ingrese la contraseña",Toast.LENGTH_SHORT).show();
            }
        }

    }