package Ejercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palabra1 = "";
        String palabra2 = "";
        Integer match = null;
        Integer len = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba la palabra uno: ");
        palabra1 = input.nextLine().toLowerCase();
        System.out.print("Escriba la palabra dos: ");
        palabra2 = input.nextLine().toLowerCase();
        match = palabra1.compareTo(palabra2);

        if(match == 0){
            System.out.println("La palabra "+ palabra1 +" y la palabra "+ palabra2 +" son iguales!");
        }else{

            if(palabra1.length() != palabra2.length()){

                System.out.println("La palabra "+ palabra1 +" y la palabra "+ palabra2 +" NO son iguales, debido a" +
                        " que la cantidad de letras que la conforman es diferente.");

                if(palabra1.length() > palabra2.length()){
                    len = palabra2.length();
                }else{
                    len = palabra1.length();
                }
            }else{
                len = palabra1.length();
            }

            for (int i = 0; i < len; i++) {

                Character letra1 = palabra1.charAt(i);
                Character letra2 = palabra2.charAt(i);

                if(letra1 != letra2){
                    System.out.println("¡Diferencia encontrada!");
                    System.out.println("En el índice "+ i +", en la palabra "+ palabra1 +" encontramos la" +
                            " letra "+ letra1 +", mientras que en la palabra "+ palabra2 +" tenemos a la" +
                            " letra "+ letra2 +". Por lo tanto, estas palabras NO son iguales.");
                }
            }
        }
    }
}
