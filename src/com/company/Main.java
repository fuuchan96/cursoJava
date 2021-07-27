package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        playMovie();
        System.out.println(" ");
        pause();
    }

    public static void playMovie(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Playing movie...");
        }
    }

    public static void pause(){
        System.out.println("Movie paused");
    }
}
