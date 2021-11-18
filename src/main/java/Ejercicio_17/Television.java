package Ejercicio_17;

public class Television extends Electrodomestico {

    protected Double resolucion = 20.0;
    protected Boolean sintonizadorTDT = false;

    public Television(){}

    public Television(Double precio, Double peso){
        this.precioBase = precio;
        this.peso = peso;
    }

    public Television(Double precioBase, String color, Character consumoEnergetico, Double peso,
                      Double resolucion, Boolean sintonizadorTDT){

        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public Double precioFinal() {

        Double precioFinal = super.precioFinal();

        if(this.resolucion > 40.0 && this.sintonizadorTDT){
            precioFinal = precioFinal + (precioFinal * 0.30) + 50;
        }else if(this.resolucion > 40.0 && !this.sintonizadorTDT){
            precioFinal = precioFinal + (precioFinal * 0.30);
        }else if(this.resolucion <= 40.0 && this.sintonizadorTDT){
            precioFinal = precioFinal + 50;
        }
        return precioFinal;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
