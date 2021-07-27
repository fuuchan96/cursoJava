package com.company;

import java.util.Scanner;

public class ejercicio6 {
    public static void main (String [] args){
        /*
        6. EJERCICIO RETO SUPER SAYAYÍN: Escribe un programa que para un número N,
        imprima los números pares desde 1 hasta N, por ejemplo si N = 6, debe imprimir “2,
        4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes imprimir
        “Inserta un número positivo”
        TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser
        dividido entre 2, si el residuo es 0, entonces el número es par. Por ejemplo si quieres
        saber si 4 es par, divides 4/2 = 2 y te sobran 0, entonces 4 es par, en cambio para
        5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
        puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Inserta un numero positivo");
            }else{
                for (int i = 1; i <= n; i++){
                 if (i % 2 == 0) {
                     System.out.println(i);
                 }
            }
        }
    }
}
