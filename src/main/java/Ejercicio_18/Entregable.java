package Ejercicio_18;

import java.lang.reflect.Array;

public interface Entregable {

    void entregar();
    void devolver();
    boolean isEntregado();
    String compareTo(Object[] arreglo);
    int contarEntregados(Object[] arreglo);

}
