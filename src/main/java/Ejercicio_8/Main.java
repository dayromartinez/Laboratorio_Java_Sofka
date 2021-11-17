package Ejercicio_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String dia = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Digite un día de la semana: ");
        dia = input.nextLine();

        switch (dia.toLowerCase()){

            case "lunes", "martes", "miercoles", "jueves", "viernes": {
                System.out.println("Es un día laboral, sumercé.");
                break;
            }

            case "sabado", "domingo": {
                System.out.println("Hoy no es un día laboral, a mimir.");
                break;
            }

            default: {
                System.out.println("Ha digitado un término equivocado. Inténtelo nuevamente.");
                break;
            }
        }
    }
}
