package com.example.omen.tarjeta;

import java.util.ArrayList;

/**
 * Created by OMEN on 26/04/2018.
 */

public class origenDeDatos {
    origenDeDatos(){}
    public ArrayList<String> getImagenes(){
     ArrayList <String> Imagenes = new ArrayList<>();
     Imagenes.add("https://www.hardcoregamer.com/wp-content/uploads/2017/01/Kingdom-Hearts-Saga-747x309.jpg");
     Imagenes.add("https://www.vsgamers.es/thumbnails/images/products/3814/main/es-sillas-gaming-gaming-polipiel-drift-edicion-especial-real-betis-balompie.jpg\n");
     Imagenes.add("https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c05525302.png\n");
     Imagenes.add("https://i.pinimg.com/originals/38/51/1e/38511edc62a639afcad9da64b71e65fb.jpg");
     Imagenes.add("https://www.allkpop.com/upload/2018/01/af_org/31092452/Girls-Generation.jpg");
     Imagenes.add("https://i.blogs.es/f2655e/god-of-war/450_1000.jpg");
     Imagenes.add("http://maespro.es/wp-content/uploads/2017/05/cielo.jpg");
     Imagenes.add("https://www.ceti.mx/cetinew/img/logo_ceti.png");
     Imagenes.add("https://media.aweita.larepublica.pe/678x508/aweita/imagen/2018/02/08/noticia-husky-siberiano.png");
     Imagenes.add("https://www.purina.es/gato/one/img/blog/como-saber-si-mi-gato-esta-enfermo.jpg");


     return Imagenes;
    }

    public ArrayList<Tarjeta> getDatos(){
        ArrayList <Tarjeta> resultado = new ArrayList<>();

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
        diez.setNombre("Mariana");
        diez.setEdad(18);
        resultado.add(diez);

        return resultado;
    }
}
