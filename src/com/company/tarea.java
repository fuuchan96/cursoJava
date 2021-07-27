package com.company;

public class tarea {
    public static void main(String[] args){
        //Supongamos que un cubo rectangular tiene las dimensiones: largo=15, ancho=23,
        //alto=12. Obtén su volumen
        int largo = 15;
        int ancho = 23;
        int alto = 12;
        int volumen = largo * ancho * alto;
        System.out.println(volumen);

        //Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
        //imprime el resultado con solo 2 decimales, la fórmula de la energía cinética es Ec= 1/2.m.vcuadrado
        int m = 12;
        int v = 3;
        double Ec = (m * Math.pow(v,2))/2.0;
        System.out.println(String.format("Energia Cinetica: %.2f",Ec));

        //¿Qué tipos variables utilizarías para los siguiente valores? Ejemplo: Si tenemos 1
        //usamos una variable de tipo int.
        //a = ‘R’
        //b. 1495970192837664
        //c. 12.5
        //d. true
        //e. 90
        //f. “No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey”
        //g. 6.626070040
        char a = 'R';
        long b = 1495970192837664L;
        double c = 12.5;
        boolean d = true;
        int e = 90;
        String f = "No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey";
        double g = 6.626070040;

        //Supongamos que promueves tu empresa en Google y debes calcular el costo
        //promedio para 180 clics, donde los clics tienen los siguientes costos
        //60 clics = $0.30 cada uno
        //100 clics = $0.25 cada uno
        //20 clics = $0.80 cada uno
        //Imprime el costo promedio que tendrás. Puedes encontrar la definición de costo
        //promedio aquí:
        //https://support.google.com/google-ads/answer/14074?hl=es-419
        //Calcúlalo de manera que debas incluir el IVA aparte, donde el IVA es 16% del total,
        //es decir, deberás calcular total + IVA, imprime el resultado a dos decimales.
        //Ejemplo: Si tu total es de $100.00, el total + IVA es $116.00

        double subtotal = (60 * 0.30) + (100 * 0.25) + (20 * 0.80);
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        System.out.println(String.format("Total a pagar $%.2f ", subtotal));


    }
}
