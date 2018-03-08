
package mainmusica;
import java.util.List;
import java.util.ArrayList;

public abstract class Coleccion {
    protected String nombre;
    List<Cancion> b = new ArrayList();
    List<PlayList> a =  new ArrayList();
    public abstract int getDuracion();
    public abstract int getCantidad();
    
}
