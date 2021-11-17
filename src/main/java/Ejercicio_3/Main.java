package Ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pi = Math.PI;
        double radio = 0;
        double area = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite el radio del círculo en cm: ");
        radio = Double.parseDouble(input.nextLine());

        area = pi * Math.pow(radio,2);
        System.out.println("El área del círculo con radio de "+ radio +" cm, es: "+ area +" cm^2.");

    }
}
