package com.company;

public class opConVariable {
    public static void main(String[] args){
        // Rectangle
        int b = 15;
        int a = 8;

        // Area
        int rArea = b * a;

        // Perimeter
        int rPerimeter = (2 * b) + (2 * a);

        // Triangle
        b = 5;
        a = 3;

        // Area
        double tArea = b * a / 2.0; //en vez de 2 se pone 2.0 para que tome la variable tipo double

        // Hypotenuse
        // Raiz cuadrada de la suma del cuadrado de los catetos
        double sumaCatetos = Math.pow(a,2) + Math.pow(b,2);
        double area = Math.sqrt(sumaCatetos);

        // Circle
        int r = 60;

        // Area (pi * radio al cuadrado)
        double Pi = 3.1416; //Math.PI; --> te da PI
        double cArea = Pi * Math.pow(r, 2);

        System.out.println("Area Rectangulo: " + rArea);
        System.out.println("Perimetro Rectangulo: "+rPerimeter);
        System.out.println("Area Triangulo: " + tArea);
        System.out.println("Area Circulo: " + cArea);
        System.out.println("Hipotenusa Triangulo: " + area);
    }
}
