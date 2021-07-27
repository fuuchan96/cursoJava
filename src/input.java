import java.util.Scanner;

public class input {
    public static void main (String [] args){
        System.out.println("Que dia de la semana es? (Lunes = 1 - Domingo = 7) ");
        // creo un input
        Scanner scanner = new Scanner(System.in);
        // lo meto en una variable para el input
        int dayOfWeek = scanner.nextInt();
        String myString = scanner.next();

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
