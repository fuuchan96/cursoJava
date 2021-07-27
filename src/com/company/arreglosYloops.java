package com.company;

public class arreglosYloops {
    public static void main (String [] args){
        int [] episodeDurationArray = new int[]{30, 32, 27, 31, 60};
        int n = episodeDurationArray.length;

        int seasonDuration = 0;

        System.out.println("Ciclo for: ");

        for(int i = 0; i < n; i++){
            seasonDuration += episodeDurationArray[i]; // A += B es igual a A = A + B
        }

        System.out.println("la serie dura " + seasonDuration + " minutos");

        System.out.println("Ciclo while: ");

        int i = 0;
        while (i < n){
            seasonDuration += episodeDurationArray[i];
            i++;
        }

        System.out.println("la serie dura " + seasonDuration + " minutos");
    }
}
