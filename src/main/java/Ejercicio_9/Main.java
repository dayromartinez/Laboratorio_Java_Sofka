package Ejercicio_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = "La sonrisa sera la mejor arma contra la tristeza.";
        String fraseAdicional = "";
        String fraseFinal = "";
        Scanner input = new Scanner(System.in);

        System.out.println(frase);
        System.out.print("Escriba una frase que desee agregar a la cita anterior: ");
        fraseAdicional = input.nextLine();

        char[] caracteres = frase.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == 'a'){
                caracteres[i] = 'e';
            }
            fraseFinal = fraseFinal + caracteres[i];
        }
        fraseFinal = fraseFinal + " " + fraseAdicional;
        System.out.println(fraseFinal);
    }
}
