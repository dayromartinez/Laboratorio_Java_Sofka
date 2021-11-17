package Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i % 2 == 0 && i % 3 == 0){
                System.out.print("Par e Impar: "+i+"\n");
            }else if(i % 2 == 0){
                System.out.print("Par: "+i+"\n");
            }else if(i % 3 == 0){
                System.out.print("Impar: "+i+"\n");
            }
        }
    }
}
