package Ejercicio_17;

public class Lavadora extends Electrodomestico {

    protected Double carga = 5.0;

    public Lavadora(){}

    public Lavadora(Double precio, Double peso){
        this.precioBase = precio;
        this.peso = peso;
    }

    public Lavadora(Double precioBase, String color, Character consumoEnergetico, Double peso, Double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    @Override
    public Double precioFinal() {

        Double precioFinal = super.precioFinal();

        if(this.carga > 30.0){
            precioFinal = precioFinal + 50;
        }

        return precioFinal;
    }

    public Double getCarga() {
        return carga;
    }
}
