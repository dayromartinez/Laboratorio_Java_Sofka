package Ejercicio_17;
import java.util.HashMap;

public class Electrodomestico {

    protected Double precioBase = 100.0;
    protected String color = "blanco";
    protected Character consumoEnergetico = 'F';
    protected Double peso = 5.0;

    public Electrodomestico(){
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomestico(Double precioBase, Double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color);
    }

    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoEnergetico);
        comprobarColor(this.color)  ;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico){
        switch (Character.toUpperCase(consumoEnergetico)){

            case 'A', 'B', 'C', 'D', 'E', 'F': {
                break;
            }

            default: {
                this.consumoEnergetico = 'F';
                break;
            }
        }
    }

    private void comprobarColor(String color){
        switch (color.toLowerCase()){

            case "blanco", "negro", "rojo", "azul", "gris": {
                break;
            }

            default: {
                this.color = "blanco";
            }
        }
    }

    public Double precioFinal(){

        Double precioFinal = this.precioBase;
        HashMap<Character, Double> precioConsumo = new HashMap();
        precioConsumo.put('A', 100.0D);
        precioConsumo.put('B', 80.0D);
        precioConsumo.put('C', 60.0D);
        precioConsumo.put('D', 50.0D);
        precioConsumo.put('E', 30.0D);
        precioConsumo.put('F', 10.0D);

        precioFinal = precioFinal + precioConsumo.get(Character.toUpperCase(this.consumoEnergetico));

        if (this.peso >= 0.0D && this.peso <= 19.0D) {
            precioFinal += 10.0D;
        }else if (this.peso >= 20.0D && this.peso <= 49.0D) {
            precioFinal += 50.0D;
        }else if (this.peso >= 50.0D && this.peso <= 79.0D) {
            precioFinal += 80.0D;
        }else if (this.peso >= 80.0D) {
            precioFinal += 100.0D;
        }

        return precioFinal;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }
}
