
package mainmusica;


public class Cancion extends Coleccion{
    private String nombreCancion,album,cantante,genero;
    private int año,duracion,ID;
    
    public Cancion(String nombreCancion,String album,String cantante,String genero,int año,int duracion,int ID){
        this.ID = ID;
        this.album = album;
        this.año = año;
        this.cantante = cantante;
        this.duracion = duracion;
        this.genero = genero;
        this.nombreCancion = nombreCancion;
        
    }
    
    public int getCantidad(){
        return 1;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "ID : "+this.ID+" | nombre de la cancion : "+this.nombreCancion+" | Artista : "+this.cantante+" | Album : "+this.album+" | Genero : "+this.genero+" | Año : "+this.año+" | Duracion : "+this.duracion;
    }
    
    
    
    
    
}
    
