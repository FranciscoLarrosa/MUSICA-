package mainmusica;

import java.util.List;
import java.util.ArrayList;

public class PlayList extends Coleccion {

    private int duracion;
    private String nombre;
    List<Coleccion> colecciones = new ArrayList<>();

    public PlayList(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Coleccion> getColecciones() {
        return colecciones;
    }

    public void setColecciones(List<Coleccion> colecciones) {
        this.colecciones = colecciones;
    }

    public int getCantidad() {
        int total = 0;
        for (Coleccion coleccione : colecciones) {
            total += coleccione.getCantidad();

        }
        return total;

    }

    public int getDuracion() {
        for (Coleccion coleccion : colecciones) {
            duracion += coleccion.getDuracion();
        }

        return duracion;
    }

}
