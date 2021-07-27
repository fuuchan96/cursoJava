package com.company;

public class metodoConRetorno {
    public static void main(String [] args){ //El void indica que el metodo no regresa nada
        String[] titleArray = new String[]{"Naruto", "Kimetsu no Yaiba", "Boku no hero academia", "your name", "el viaje de chihiro", "A silent voice",
                "Hotarubi no Mori e"};

        String title = play(titleArray, 3); //Meto el valor retornado del metodo en una variable String
        System.out.println(" ");
        pause(title);
    }

    public static String play(String[]movie,int index){ //Cambio el void por el String porque retorna un valor String
        if (index < movie.length){
            String title = movie[index];
            for(int i = 0; i <= 10; i++){
                System.out.println("Playing movie: " + title);
            }
            return title;
        }else{
            System.out.println("Index is too big");
            return "";
        }
    }

    public static void pause(String title){
        if (title.isEmpty()){
            System.out.println("No movie playing");
        }else{
            System.out.println("Movie paused: " + title);
        }
    }
}
