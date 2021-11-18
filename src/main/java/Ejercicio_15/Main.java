package Ejercicio_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer opcion = 0;
        Scanner input = new Scanner(System.in);

        while (opcion != 8){

            System.out.println("****** Gestión Cinematográfica ******");
            System.out.println("1. Nuevo actor");
            System.out.println("2. Buscar actor");
            System.out.println("3. Eliminar actor");
            System.out.println("4. Modificar actor");
            System.out.println("5. Ver todos los actores");
            System.out.println("6. Ver películas de los actores");
            System.out.println("7. Ver categoría de las películas de los actores");
            System.out.println("8. SALIR");
            System.out.print("Digite alguna de las opciones anteriores: ");
            opcion = Integer.parseInt(input.nextLine());

            switch (opcion){

                case 1,2,3,4,5,6,7: {
                    break;
                }

                case 8: {
                    System.out.println("¡Programa finalizado con éxito!");
                    break;
                }

                default: {
                    System.out.println("Opción Incorrecta.");
                    break;
                }
            }
        }
    }
}
