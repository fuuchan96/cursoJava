package com.company;

import java.util.Scanner;

public class arreglos {
    public static void main (String [] args){
        System.out.println("Escribe el numero de episodio que quieras saber su duracion");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
        episodeIndex--; //al valor ingresado le resta 1

        /*  int [] episodeDurationArray = new int[5];

        episodeDurationArray[0] =30;
        episodeDurationArray[1] =32;
        episodeDurationArray[2] =27;
        episodeDurationArray[3] =31;
        episodeDurationArray[4] =60;

        if (episodeIndex >= 0 && episodeIndex < 5){
            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El episodio dura " + episodeDuration + " minutos");
        }else{
            System.out.println("error, la serie tiene solo 5 episodios");
        }
        */
        System.out.println("-------------------");
        System.out.println("-------------------");

        // ES LO MISMO DE ARRIBA, PERO MAS PROLIJO Y EVITA ERRORES POR SI CAMBIA EL LARGO DEL ARREGLO

        int [] episodeDurationArray = new int[]{30, 32, 27, 31, 60};
        int n = episodeDurationArray.length;

        if (episodeIndex >= 0 && episodeIndex < n){
            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El episodio dura " + episodeDuration + " minutos");
        }else{
            System.out.println("error, la serie tiene solo "+ n +" episodios");
        }

    }
}
