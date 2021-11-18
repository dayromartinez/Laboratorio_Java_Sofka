package Ejercicio_11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = "";
        Integer longitud = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        frase = input.nextLine();
        longitud = frase.length();
        int[] contadorVocales = new int[5];

        for (int i = 0; i < longitud; i++) {

            Character letra = frase.charAt(i);
            letra = Character.toLowerCase(letra);

            switch (letra){

                case 'a': {
                    contadorVocales[0] = contadorVocales[0] + 1;
                    break;
                }
                case 'e': {
                    contadorVocales[1] = contadorVocales[1] + 1;
                    break;
                }
                case 'i': {
                    contadorVocales[2] = contadorVocales[2] + 1;
                    break;
                }
                case 'o': {
                    contadorVocales[3] = contadorVocales[3] + 1;
                    break;
                }
                case 'u': {
                    contadorVocales[4] = contadorVocales[4] + 1;
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.println("La frase "+ frase + ", tiene "+ longitud +" caracteres en total, incluyendo espacios" +
                ". Como tal, tiene "+ contadorVocales[0] + " vocales 'a'; "+ contadorVocales[1] +" vocales 'e'; "
        + contadorVocales[2] + " vocales 'i'; "+ contadorVocales[3] + " vocales 'o' y finalmente, "
        + contadorVocales[4] + " vocales 'u'.");
    }
}
