package Ejercicio_13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fechaActual = Calendar.getInstance().getTime();
        DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
        String fechaCadena = formateador.format(fechaActual);
        System.out.println("La fecha y hora actual es: "+fechaCadena);
    }
}
