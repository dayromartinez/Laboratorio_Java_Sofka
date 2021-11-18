package Ejercicio_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Integer numero = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite un número: ");
        numero = Integer.parseInt(input.nextLine());

        if(numero < 1000){
            for (int i = numero; i < 1001; i = i + 2) {
                System.out.println(i);
            }
        }else{
            System.out.println("Número demasiado grande para este ejercicio. Inténtelo de nuevo.");
        }
    }
}
