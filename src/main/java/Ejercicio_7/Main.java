package Ejercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite un número: ");
            num = Double.parseDouble(input.nextLine());

        }while (num < 0);

        System.out.println("El número es: "+num);
    }
}
