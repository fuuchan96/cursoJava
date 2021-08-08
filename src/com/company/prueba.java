package com.company;
import java.util.Scanner;

public class prueba {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String saludo = scanner.next();
        int longitud = saludo.length();
        boolean contiene = saludo.contains("a");
        String remplazo = scanner.next();
        String newString = saludo.replace("o", remplazo);
        System.out.println(newString);
    }
}
