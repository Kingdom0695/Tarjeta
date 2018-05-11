package com.example.omen.tarjeta;

import java.util.ArrayList;

/**
 * Created by OMEN on 26/04/2018.
 */

public class origenDeDatos {
    origenDeDatos(){}
    public ArrayList<Tarjeta> getDatos(){
        ArrayList <Tarjeta> resultado = new ArrayList<Tarjeta>();

        Tarjeta uno = new Tarjeta();
        uno.setDescripcion("Soy corredor");
        uno.setNombre("Daniel");
        uno.setEdad(19);
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.setDescripcion("Soy atleta");
        dos.setNombre("Palomino");
        dos.setEdad(19);
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.setDescripcion("Soy boxeador");
        tres.setNombre("Ivan");
        tres.setEdad(19);
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.setDescripcion("Soy nadador");
        cuatro.setNombre("Juan");
        cuatro.setEdad(19);
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.setDescripcion("Soy ciclista");
        cinco.setNombre("Edson");
        cinco.setEdad(19);
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.setDescripcion("Soy sumo");
        seis.setNombre("Ramiro");
        seis.setEdad(19);
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.setDescripcion("Soy vendedor");
        siete.setNombre("Oliver");
        siete.setEdad(19);
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.setDescripcion("Soy artista");
        ocho.setNombre("Diego");
        ocho.setEdad(19);
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.setDescripcion("Soy un hombre");
        nueve.setNombre("Cesar");
        nueve.setEdad(19);
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.setDescripcion("Soy una mujer");
        diez.setNombre("Daniela");
        diez.setEdad(19);
        resultado.add(diez);

        return resultado;
    }
}
