package Ejercicio_16;

public class Persona {

    private String nombre = "";
    private Integer edad = 0;
    private String DNI = this.generaDNI();
    //'O' "otro" hace referencia a un género diferente al masculino o femenino. Este será el género por defecto.
    private Character genero = 'O';
    private Double peso = 0.0;
    private Double altura = 0.0;

    public Persona(){

    }

    public Persona(String nombre, Integer edad, Character genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona(String nombre, Integer edad, Character genero, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){

        double imc = (this.peso / (Math.pow(this.altura,2)));
        if(imc < 20){
            //Debajo del peso ideal
            return -1;
        }else if(imc >=20 && imc <= 25){
            //Peso ideal
            return 0;
        }else{
            //Por encima del peso ideal
            return 1;
        }
    }

    private String generaDNI(){

        //Para este proceso, se hizo uso del método de generación de DNI implementado en España
        int num = (int)(Math.random() * 9.0E7D) + 10000000;
        int resto = num % 23;
        String[] Letras = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        String DNI = String.valueOf(num).concat(Letras[resto]);
        this.DNI = DNI;
        return DNI;
    }

    public boolean esMayorEdad(){
       Boolean mayoriaEdad = (this.edad < 18) ? false : true;
       return mayoriaEdad;
    }

    private char comprobarGenero(char genero){
        switch (genero){

            //'O' "otro" hace referencia a un género diferente al masculino o femenino.
            // Este será el género por defecto.
            case 'H', 'M', 'O': {
                return genero;
            }
            default: {
                this.genero = 'O';
                return this.genero;
            }
        }
    }

    @Override
    public String toString() {

        String IMC = "";
        if (this.calcularIMC() == -1) {
            IMC = "está por debajo de su peso ideal.";
        } else if (this.calcularIMC() == 0) {
            IMC = "está en su peso ideal.";
        } else {
            IMC = "está por encima de su peso ideal.";
        }

        String mayoredad = "";
        if(this.esMayorEdad()){
            mayoredad = " y es mayor de edad";
        }else{
            mayoredad = " y es menor de edad";
        }

        return "Esta persona tiene las siguientes características:\n" +
                "Nombre:'" + this.nombre + '\'' +
                "; Edad: " + this.edad +
                " años" + mayoredad +
                "; Género: '" + this.comprobarGenero(this.genero) +
                "'; Altura: " + this.altura +
                " metros; Peso: " + this.peso +
                " kilogramos y " + IMC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
