package Ejercicio_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object[] electrodomesticos = new Object[10];
        Double precioLavadoras = 0.0, precioTelevisores = 0.0, precioElectrodomesticos = 0.0, precioTotal = 0.0, precio = 0.0;

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(100.0, 60.2);
        electrodomesticos[2] = new Electrodomestico(200.0, "negro", 'E', 55.5);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(300.0, 85.9);
        electrodomesticos[5] = new Lavadora(400.0, "rojo", 'a', 93.4, 45.3);
        electrodomesticos[6] = new Television();
        electrodomesticos[7] = new Television(500.0, 33.3);
        electrodomesticos[8] = new Television(600.0, "gris", 'C', 56.8, 65.7,true);
        electrodomesticos[9] = new Television(700.0, "azul", 'b', 68.9, 85.0, false);

        for (int i = 0; i < electrodomesticos.length; i++) {
            if(electrodomesticos[i] instanceof Lavadora){
                precio = ((Lavadora) electrodomesticos[i]).precioFinal();
                precioLavadoras = precioLavadoras + precio;
                System.out.println("Esto es una lavadora y su precio es de: $" + precio +" euros.");
            }else if(electrodomesticos[i] instanceof Television){
                precio = ((Television) electrodomesticos[i]).precioFinal();
                precioTelevisores = precioTelevisores + precio;
                System.out.println("Esto es un televisor y su precio es de: $" + precio +" euros.");
            }else{
                precio = ((Electrodomestico) electrodomesticos[i]).precioFinal();
                precioElectrodomesticos = precioElectrodomesticos + precio;
                System.out.println("Esto es un electrodoméstico diferente, y su precio es de: $" + precio +" euros.");
            }
        }

        precioTotal = precioLavadoras + precioElectrodomesticos + precioTelevisores;
        System.out.println("El precio ponderado de las lavadoras en esta compra fue de: $"+ precioLavadoras + " euros, mientras que el precio acumulado " +
                "para los televisores es de: $"+ precioTelevisores +" euros; así mismo, el precio ponderado de otro tipo de electrodomésticos fue de: $" +
                ""+ precioElectrodomesticos +" euros. Por lo anterior, el precio TOTAL para esta compra de electrodomésticos " +
                "es de: $"+ precioTotal +" euros.");
    }
}
