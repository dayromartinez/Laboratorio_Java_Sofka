package Ejercicio_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = "";
        String fraseFinal = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba una frase: ");
        frase = input.nextLine();
        String[] partes = frase.split(" ");
        for (int i = 0; i < partes.length; i++) {
            fraseFinal = fraseFinal + partes[i];
        }
        System.out.println("La frase "+ frase +", sin espacios es: "+fraseFinal);
    }
}
