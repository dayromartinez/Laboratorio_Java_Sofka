package Ejercicio_5;

public class Main {
    public static void main(String[] args) {

        int contador = 1;
        int ronda = 1;

        while(ronda !=3){

            if(contador == 1 && ronda == 1){
                System.out.println("NÚMEROS PARES:");
            }else if(contador == 1 && ronda == 2){
                System.out.println("NÚMEROS IMPARES:");
            }

            if(ronda == 1){
                if(contador < 101){
                    if(contador % 2 == 0){
                        System.out.println(contador);
                    }
                    contador++;
                }else{
                    ronda++;
                    contador = 1;
                }
            }else{
                if(contador < 101){
                    if(contador % 3 == 0){
                        System.out.println(contador);
                    }
                    contador++;
                }else{
                    ronda++;
                }
            }
        }
    }
}
