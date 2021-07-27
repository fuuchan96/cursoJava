package com.company;

public class arreglosDeString {
    public static void main(String [] args){
        String[] movieTitleArray = new String[]{"up", "Titanic", "Aladdin", "pepe el toro", "Avengers", "Matrix"};

        for (String title : movieTitleArray){ //String title : movieTitleArray = es lo mismo que el i = 0; i < n; i++
          if (!title.contains("i")){ //si el titulo NO contiene la letra i{}
              System.out.println(title);
          }

        }
    }
}
