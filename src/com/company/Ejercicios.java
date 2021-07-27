package com.company;
import java.util.Scanner;
public class Ejercicios {
    public static void main(String [] args){
        /*
        1. Crea un programa que te pida una cantidad en miligramos para una poción
            multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
            “¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
            mediocre, sangre sucia inmunda”.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de mg para la pocion multijugos: ");
        int cantidadMg = scanner.nextInt();
        int cantidadNecesaria = 100;

        if (cantidadMg > cantidadNecesaria ){
            System.out.println("¡Felicidades, es una buena poción!");
        }else{
            System.out.println("La poción es mediocre, sangre sucia inmunda");
        }

        System.out.println("-------------------");
        System.out.println("-------------------");

        /*
        2. Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
            esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el
            programa te pedirá dos valores, la distancia del conductor en kilómetros y su
            disponibilidad, donde false = no disponible y true = disponible,
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Indique la distancia al conductor ");
        double distanciaConductor = myScanner.nextDouble();

        System.out.println("El conductor esta disponible? indique con True o False");
        boolean isAviable = myScanner.nextBoolean();
        /*
         según los datos que insertes imprime lo siguiente:
                ➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible,
                imprime “Listo para iniciar recorrido”
                ➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible,
                imprime, “Conductor cercano, pero no disponible”
                ➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime,
                “Conductor disponible pero muy lejos, aplicarán tarifas más altas”
                ➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime,
                “No hay conductores disponibles”
         */
        if (distanciaConductor <= 0.5 && isAviable){
            System.out.println("Listo para iniciar recorrido");
        }else if(distanciaConductor <= 0.5 && !isAviable){
            System.out.println("Conductor cercano, pero no disponible");
        }else if(distanciaConductor > 0.5 && isAviable){
            System.out.println("Conductor disponible pero muy lejos, aplicarán tarifas más altas");
        }else{
            System.out.println("No hay conductores disponibles");
        }

        /*
                ➢ Usa if-else para esto
                ➢ Para negar una validación debes usar el símbolo !, por ejemplo if
                (!isAvailable)
                ➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada
         */

        /*
            3. Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
            para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
            así: “La suma es 15” usando formatos de String
         */
        System.out.println("indique un numero: ");
        int n = myScanner.nextInt();

        int total = 0;
        for (int i= 0; i<= n; i++){
            total += i;
        }
        System.out.println(String.format("La suma es %d", total));


        /*
        4. Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
            número que insertes te imprima los siguientes valores
            ➢ 1 = “Soleado”
            ➢ 2 = “Nublado”
            ➢ 3 = “Lluvioso”
            ➢ 4 = “Tormentoso”
            ➢ 5 = “Nevado”
            Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
            Recomendación: Usa Switch.
         */
        System.out.println("¿Cómo es el clima de hoy? ");
        int clima = myScanner.nextInt();

        switch (clima){
            case 1:
                System.out.println("Soleado");
                break;
            case 2:
                System.out.println("Nublado");
                break;
            case 3:
                System.out.println("Lluvioso");
                break;
            case 4:
                System.out.println("Tormentoso");
                break;
            case 5:
                System.out.println("Nevado");
                break;
            default:
                System.out.println("Pregúntale a Google");
        }

        /*
            5. Para un Arreglo de String de títulos de películas, imprime el título de la película con
            el título más largo. Por ejemplo si tenemos un arreglo con los valores:
            {“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
            Debería imprimir “Batman: El caballero de la noche”.
            RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior,
            debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche”
         */
        String [] titulosDePeliculas = new String[]{"Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill"};

        int maxLenght = 0;
        String tituloMasLargo = "";
        for(String titulo : titulosDePeliculas){
            int largotitulo = titulo.length();
            if (largotitulo > maxLenght){
                maxLenght = largotitulo;
                tituloMasLargo = titulo;
            }
        }
        System.out.println(tituloMasLargo);
    }
}
