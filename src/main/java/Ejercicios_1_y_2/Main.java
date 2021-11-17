package Ejercicios_1_y_2;

import java.util.Scanner;

public class Main {

    double numero1 = 0;
    double numero2 = 0;

    public static void main(String[] args) {

        Main comparador = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("¡Bienvenid@ al comparador numérico!");

        System.out.print("Digite el primer número: ");
        comparador.numero1 = Double.parseDouble(input.nextLine());

        System.out.print("Digite el segundo número: ");
        comparador.numero2 = Double.parseDouble(input.nextLine());

        if(comparador.numero1 > comparador.numero2){
            System.out.println(""+ comparador.numero1 +" es mayor que "+ comparador.numero2+".");
        }else if(comparador.numero2 > comparador.numero1){
            System.out.println(""+ comparador.numero2 +" es mayor que "+ comparador.numero1+".");
        }else{
            System.out.println(""+ comparador.numero2 +" es igual que "+ comparador.numero1+".");
        }
    }
}
