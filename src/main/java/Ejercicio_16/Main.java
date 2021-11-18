package Ejercicio_16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        Integer edad;
        Character genero;
        Double peso, altura;
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba el nombre de la persona: ");
        nombre = input.nextLine();

        System.out.print("Digite la edad de esta persona: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Digite el género de esta persona: ");
        System.out.println("F -> Femenino");
        System.out.println("M -> Masculino");
        System.out.println("O -> Otro");
        System.out.print("Teclee alguna de las tres letras anteriores: ");
        genero = input.nextLine().charAt(0);

        System.out.print("Digite la altura de esta persona en metros: ");
        altura = Double.parseDouble(input.nextLine());

        System.out.print("Digite el peso de esta persona en kilogramos: ");
        peso = Double.parseDouble(input.nextLine());

        Persona persona1 = new Persona(nombre, edad, genero, peso, altura);
        Persona persona2 = new Persona(nombre, edad, genero);
        Persona persona3 = new Persona();
        persona3.setNombre("Aureliano Buendía");
        persona3.setEdad(15);
        persona3.setGenero('O');
        persona3.setAltura(1.60);
        persona3.setPeso(85.6);

        System.out.println(persona1.calcularIMC());
        System.out.println(persona1.esMayorEdad());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona2.esMayorEdad());
        System.out.println(persona3.calcularIMC());
        System.out.println(persona3.esMayorEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
