package Ejercicio_18;

public class Serie implements Entregable {

    private String titulo = "";
    private Integer numeroTemporadas = 3;
    private Boolean entregado = false;
    private String genero = "";
    private String creador = "";


    public Serie(){}

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String creador, Integer numeroTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
    }

    @Override
    public String toString() {

        String entregado = "";
        if (this.entregado){
            entregado = "y fue entregada";
        }else if(this.entregado == false){
            entregado = "y NO fue entregada";
        }

        return "La serie " +
                "'" + this.titulo + '\'' +
                ", tiene " + this.numeroTemporadas +
                " temporadas, " + entregado +
                ". Es una serie del género de '" + this.genero + '\'' +
                ", y su creador fue: '" + this.creador + '\'' +
                '.';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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

        Integer masTemporadas = 0;
        String serie = "";

        for (int i = 0; i < (arreglo.length - 1); i++) {

            if(arreglo[i] instanceof Serie){
                if(i == 0){
                    if(((Serie) arreglo[i]).getNumeroTemporadas() > ((Serie) arreglo[i+1]).getNumeroTemporadas()){
                        masTemporadas = ((Serie) arreglo[i]).getNumeroTemporadas();
                        serie = ((Serie) arreglo[i]).getTitulo();
                    }else if(((Serie) arreglo[i]).getNumeroTemporadas() == ((Serie) arreglo[i+1]).getNumeroTemporadas()){
                        masTemporadas = ((Serie) arreglo[i]).getNumeroTemporadas();
                        serie = ((Serie) arreglo[i]).getTitulo();
                    }else{
                        masTemporadas = ((Serie) arreglo[i+1]).getNumeroTemporadas();
                        serie = ((Serie) arreglo[i+1]).getTitulo();
                    }
                }else{
                    if(masTemporadas < ((Serie) arreglo[i+1]).getNumeroTemporadas()){
                        masTemporadas = ((Serie) arreglo[i+1]).getNumeroTemporadas();
                        serie = ((Serie) arreglo[i+1]).getTitulo();
                    }
                }
            }
        }
        return serie;
    }

    @Override
    public int contarEntregados(Object[] arreglo) {

        Integer entregados = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] instanceof Serie){
                if(((Serie) arreglo[i]).isEntregado()){
                    entregados++;
                }
            }
        }
        return entregados;
    }
}
