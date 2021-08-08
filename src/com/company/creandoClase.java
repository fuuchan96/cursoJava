package com.company;
public class creandoClase {

    //SE CREAN LOS ATRIBUTOS DE UNA CLASE Y SE USAN EN CLASESYOBJETOS.JAVA
    String name;
    String genero;
    int duracion;

    public creandoClase(String name, String genero, int duracion){
        this.name = name;
        this.genero = genero;
        this.duracion = duracion;
    }

    public creandoClase(String name, String genero){
        this.name = name;
        this.genero = genero;
        this.duracion = 0;
    }

    public creandoClase(){
        this.name = "No title";
        this.genero = "No genero";
        this.duracion = 0;
    }

    public String getName(){
        return "titulo: " + name;
    }

    public String getGenero(){
        return "genero: " + genero;
    }

    public int getDuration(){
        return duracion;
    }
}
