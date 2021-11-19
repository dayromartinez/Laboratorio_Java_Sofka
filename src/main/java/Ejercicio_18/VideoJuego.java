package Ejercicio_18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VideoJuego implements Entregable {

    private String titulo = "";
    private Integer horasEstimadas = 10;
    private Boolean entregado = false;
    private String genero = "";
    private String empresa = "";


    public VideoJuego(){}

    public VideoJuego(String titulo, Integer horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, Integer horasEstimadas, String genero, String empresa){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {

        String entregado = "";
        if (this.entregado){
            entregado = "y fue entregado";
        }else if(this.entregado == false){
            entregado = "y NO fue entregado";
        }

        return "Este videoJuego tiene como título: " +
                "'" + titulo + '\'' +
                ", tiene una jugabilidad de " + horasEstimadas +
                " horas estimadas, " + entregado +
                ". Como tal, pertenece al género de '" + genero + '\'' +
                ", y fue desarrollado por la compañía '" + empresa + '\'' +
                '.';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public String compareTo(Object[] arreglo) {

        Integer masHoras = 0;
        String videoJuego = "";

        for (int i = 0; i < (arreglo.length - 1); i++) {

            if(arreglo[i] instanceof VideoJuego){
                if(i == 0){
                    if(((VideoJuego) arreglo[i]).getHorasEstimadas() > ((VideoJuego) arreglo[i+1]).getHorasEstimadas()){
                        masHoras = ((VideoJuego) arreglo[i]).getHorasEstimadas();
                        videoJuego = ((VideoJuego) arreglo[i]).getTitulo();
                    }else if(((VideoJuego) arreglo[i]).getHorasEstimadas() == ((VideoJuego) arreglo[i+1]).getHorasEstimadas()){
                        masHoras = ((VideoJuego) arreglo[i]).getHorasEstimadas();
                        videoJuego = ((VideoJuego) arreglo[i]).getTitulo();
                    }else{
                        masHoras = ((VideoJuego) arreglo[i+1]).getHorasEstimadas();
                        videoJuego = ((VideoJuego) arreglo[i+1]).getTitulo();
                    }
                }else{
                    if(masHoras < ((VideoJuego) arreglo[i+1]).getHorasEstimadas()){
                        masHoras = ((VideoJuego) arreglo[i+1]).getHorasEstimadas();
                        videoJuego = ((VideoJuego) arreglo[i+1]).getTitulo();
                    }
                }
            }
        }
        return videoJuego;
    }

    @Override
    public int contarEntregados(Object[] arreglo) {

        Integer entregados = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] instanceof VideoJuego){
                if(((VideoJuego) arreglo[i]).isEntregado()){
                    entregados++;
                }
            }
        }
        return entregados;
    }
}
