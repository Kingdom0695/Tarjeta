package com.example.omen.tarjeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class actividadejemploActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividadejemplo);

        Intent destino = getIntent(); //declarando el Destino
        int Edad = destino.getIntExtra("Edad", -1); //si tiene un -1, la variable no llego
        int Imagen = destino.getIntExtra("Imagen", -1);
        String Nombre = destino.getStringExtra("Nombre");
        String Descripcion = destino.getStringExtra("Descripcion");

        TextView nombre = (TextView) findViewById(R.id.TextviewEjem); //Vincular el textview
        nombre.setText(Nombre); //Obtener el nombre
        //nombre.setText(Descripcion);
    }
}
