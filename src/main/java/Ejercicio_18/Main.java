package Ejercicio_18;

public class Main {
    public static void main(String[] args) {

        String serieMasTemporadas;
        String videoJuegoMasHoras;

        Object[] series = new Object[5];
        series[0] = new Serie();
        series[1] = new Serie("Pedro el Escamoso","Juan Carlos Villamizar");
        series[2] = new Serie("Padres e Hijos", "Roberto Reyes Toledo", 17, "Drama, comedia, reflexión");
        series[3] = new Serie("Yo soy Betty, la fea","Fernando Gaitán", 1, "Telenovela");
        series[4] = new Serie("Pasión de Gavilanes", "Julio Jiménez", 1,"Telenovela");

        ((Serie) series[2]).entregar();
        ((Serie) series[3]).entregar();
        ((Serie) series[4]).entregar();
        serieMasTemporadas = ((Serie) series[0]).compareTo(series);

        System.out.println("La cantidad de series entregadas es: "+((Serie) series[0]).contarEntregados(series));
        System.out.println("La serie con más temporadas es: "+serieMasTemporadas);


        Object[] videojuegos = new Object[5];
        videojuegos[0] = new VideoJuego();
        videojuegos[1] = new VideoJuego("Winning Eleven 11", 48);
        videojuegos[2] = new VideoJuego("Grand Theft Auto: San Andreas", 1000, "Acción - Aventura", "Rockstar Games");
        videojuegos[3] = new VideoJuego("World of Warcraft", 3000, "Rol multijugador masivo en línea", "Blizzard");
        videojuegos[4] = new VideoJuego("Halo 2", 1111, "Disparos","Bungie Studios");

        ((VideoJuego) videojuegos[3]).entregar();
        ((VideoJuego) videojuegos[4]).entregar();
        videoJuegoMasHoras = ((VideoJuego) videojuegos[0]).compareTo(videojuegos);

        System.out.println("La cantidad de videojuegos entregados es: " +((VideoJuego) videojuegos[0]).contarEntregados(videojuegos));
        System.out.println("El videojuego con más horas estimadas es: "+videoJuegoMasHoras);

        for (int i = 0; i < series.length; i++) {

            if(((Serie) series[i]).getTitulo() == serieMasTemporadas){
                System.out.println(series[i].toString());
            }

            if(((VideoJuego) videojuegos[i]).getTitulo() == videoJuegoMasHoras){
                System.out.println(videojuegos[i].toString());
            }
        }
    }
}
