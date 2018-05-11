package com.example.omen.tarjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.lista);
        origenDeDatos datos = new origenDeDatos();
        tarjetaAdapter adapter = new tarjetaAdapter();
        adapter.contexto = this;
        adapter.imagen = datos.getImagenes();
        adapter.datos = datos.getDatos();
        lista.setAdapter(adapter);

    }

    public ListView lista;

    origenDeDatos objetoODD;
    tarjetaAdapter objetoTA;
}
