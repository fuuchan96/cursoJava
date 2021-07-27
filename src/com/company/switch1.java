package com.company;

public class switch1 {
    public static void main (String [] args){
        int dayOfWeek = 1;

        if (dayOfWeek == 1){
            System.out.println("Es Lunes de comedia");
        }else if (dayOfWeek == 2){
            System.out.println("Es Martes de drama");
        }else if (dayOfWeek == 3){
            System.out.println("Es Miercoles de accion");
        }else if (dayOfWeek == 4){
            System.out.println("Es Jueves de animadas");
        }else if (dayOfWeek == 5){
            System.out.println("Es Viernes de terror");
        }else if (dayOfWeek == 6){
            System.out.println("Es Sabado de documental");
        }else if (dayOfWeek == 7){
            System.out.println("Es Domingo de comodin");
        }else{
            System.out.println("En que dia vives? ");
        }


        System.out.println("-------------------");
        System.out.println("-------------------");

        switch (dayOfWeek){
            case 1:
                System.out.println("Es Lunes de comedia");
                break;
            case 2:
                System.out.println("Es Martes de drama");
                break;
            case 3:
                System.out.println("Es Miercoles de accion");
                break;
            case 4:
                System.out.println("Es Jueves de animadas");
                break;
            case 5:
                System.out.println("Es Viernes de terror");
                break;
            case 6:
                System.out.println("Es Sabado de documental");
                break;
            case 7:
                System.out.println("Es Domingo de comodin");
                break;
            default:
                System.out.println("En que dia vives? ");
        }





    }
}
