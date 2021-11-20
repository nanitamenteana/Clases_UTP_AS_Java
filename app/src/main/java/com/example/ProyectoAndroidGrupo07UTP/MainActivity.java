package com.example.ProyectoAndroidGrupo07UTP;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar una variable global para que todos los métodos la identifiquen
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Metodo onCreate()", Toast.LENGTH_LONG).show();
        Log.i("Esto es una prueba", "Error");
        //Buscar texto por id
        t1 = (TextView) findViewById(R.id.textview);
        //Cambiar texto relacionado con el ID para hacer cambios en tiempo de ejecución
        t1.setText("¡Hola Mundo Cruel!");
        //Cambiar tamaño texto relaciona con el ID
        t1.setTextSize(24);
        //Cambiar color texto relacionado con el ID
        t1.setTextColor(Color.BLUE);
        t1.getWidth();
        Toast.makeText(this,""+t1.getWidth(),Toast.LENGTH_SHORT);
    }
//Para observar el ancho de un texto
    public void onWindowsFocus(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus) {
            Toast.makeText(this,""+t1.getWidth(),Toast.LENGTH_SHORT);
        }

    }
// Para llamar por un botón a la siguiente actividad

    public void goToActivity2(View view) {
        Intent newIntent = new Intent(this,SecondActivity.class);
        newIntent.putExtra("msg", "Hola Activity 2"); //Esto es para poner un mensaje
        newIntent.putExtra("msg", "Bienvenido");
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
    }

    //Metodo para crear las opciones del menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();

        if(id == R.id.mnu_actividad2){
            Intent newIntent = new Intent(this,SecondActivity.class);
            newIntent.putExtra("msg", "Hola Activity 2"); //Esto es para poner un mensaje
            newIntent.putExtra("msg", "Bienvenido");
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(newIntent);
        }

        else if(id == R.id.mnu_actividad3){
            Intent newIntent = new Intent(this,ThirdActivity.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(newIntent);
        }

        return super.onOptionsItemSelected(menuItem);
    }

    //Para capturar el evento cuando se da click en el boton back
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this, R.style.ThemeOverlay_AppCompat_Dialog_Alert)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Información")
                    .setMessage("¿Desea salir?")
                    .setNegativeButton("No", null)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.finish();
                        }
                    }).show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Metodo onStar()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Metodo onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Metodo onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Metodo onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Metodo onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("informacion","La actividad fue destruida");
        Toast.makeText(getApplicationContext(), "Metodo onDestroy()", Toast.LENGTH_LONG).show();
    }

}