package com.company;

public class argumentos {
    public static void main(String [] args){
        String[] titleArray = new String[]{"Naruto", "Kimetsu no Yaiba", "Boku no hero academia", "your name", "el viaje de chihiro", "A silent voice",
                                            "Hotarubi no Mori e"};

        play(titleArray, 1);
        System.out.println(" ");
        pause();

    }
    public static void play(String[]movie,int index){
        if (index < movie.length){
            String title = movie[index];
            for(int i = 0; i <= 10; i++){
                System.out.println("Playing movie: " + title);
            }
        }else{
            System.out.println("Index is too big");
        }

    }

    public static void pause(){
        System.out.println("Movie paused");
    }
}
