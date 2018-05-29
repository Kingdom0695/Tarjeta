package com.example.omen.tarjeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

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
        String Link = destino.getStringExtra("Link"); // Para el link



        TextView nombre = (TextView) findViewById(R.id.TextviewNom); //Vincular el textview
        nombre.setText(Nombre); //Obtener el nombre

        TextView edad = (TextView) findViewById(R.id.TextviewEdad);
        edad.setText(""+Edad); //Obtiene la edad

        TextView descripcion = (TextView) findViewById(R.id.TextviewDesc);
        descripcion.setText(Descripcion); //Obtiene la descripcion

        ImageView imagen = (ImageView) findViewById(R.id.imagen2);

        TextView url = (TextView) findViewById(R.id.TextviewURL);
        url.setText(Link);

        Picasso.with(this).load(Link).into(imagen);

    }
}
