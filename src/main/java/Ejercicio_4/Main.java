package Ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio = 0;
        double precioFinal = 0;
        final double iva = 0.21;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());

        precioFinal = precio + (precio * iva);
        System.out.println("El precio del producto ("+ precio +") más IVA, es de: $"+ precioFinal +" pesos");
    }
}
