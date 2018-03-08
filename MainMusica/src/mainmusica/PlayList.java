package mainmusica;

import java.util.List;
import java.util.ArrayList;

public class PlayList {

    private float duracion;

    List<Cancion> canciones = new ArrayList<>();

    public PlayList() {

    }

    public void agregarCanciones(Cancion unaCancion) {
        canciones.add(unaCancion);
    }

    public float duracionTotal() {

        for (Cancion a : canciones) {
            duracion += a.getDuracion();
        }
        return duracion;
    }
    
    public int totalCanciones(){
        int total = 0;
        for (Cancion ab : canciones) {
           total += canciones.size();
        }
        return total;
    }
    
    public String mostrarCanciones (){
        for (Cancion elementos : canciones) {
            return " ID : "+elementos.getID()+"\n Titulo : "+elementos.getNombreCancion()+"\n Artista : "+elementos.getCantante()+"\n Album : "+elementos.getNombreAlbum()+"\n Duracion : "+elementos.getDuracion();
        }
        return"aa";
    }
    
}
