package com.company;

public class clasesYObjetos {
    public static void main (String [] args){
        // SE USAN LOS ATRIBUTOS DE CREANDO CLASE
        creandoClase naruto = new creandoClase();
        creandoClase nanbaka = new creandoClase("Nanbaka", "Anime");
        creandoClase vampireKnight = new creandoClase("Vampire Knight", "Anime", 25);
        /*
        naruto.setName("Naruto");
        naruto.setGenero("Anime");
        naruto.setDuracion(25);
        it's the same shit <')
                           (v)
         */
        System.out.println(naruto.getName());
        System.out.println(naruto.getGenero());
        System.out.println("duracion de capitulo: " + naruto.getDuration());
        System.out.println("------------------------");
        System.out.println(nanbaka.getName());
        System.out.println(nanbaka.getGenero());
        System.out.println("duracion de capitulo: " + nanbaka.getDuration());
        System.out.println("------------------------");
        System.out.println(vampireKnight.getName());
        System.out.println(vampireKnight.getGenero());
        System.out.println("duracion de capitulo: " + vampireKnight.getDuration());

        vampireKnight.play();
        vampireKnight.pause();
        nanbaka.play();
    }

}
