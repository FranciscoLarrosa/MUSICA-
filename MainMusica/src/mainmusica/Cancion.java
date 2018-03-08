
package mainmusica;


public class Cancion {
    
    Atributos datos;
    public Cancion(Atributos datos){
        this.datos = datos;
    }
    public String getNombreCancion(){
        return datos.getNombreCancion();
    }
    
    public int getID(){
        return datos.getiD();
    }
    
    public double getDuracion(){
        return datos.getDuracion();
        
    }
    
    public String getCantante(){
        return datos.getCantante();
    }
    
    public String getNombreAlbum(){
        return datos.getNombreAlbum();
    }
    
    public int getAño(){
        return datos.getAño();
        
    }
    
    public String getGenero(){
        return datos.getGenero();
    }
}
