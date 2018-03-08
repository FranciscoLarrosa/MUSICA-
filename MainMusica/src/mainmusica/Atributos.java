package mainmusica;

public class Atributos {
    private String nombreCancion;
    private int iD;
    private double duracion;
    private String cantante;
    private String nombreAlbum;
    private int año;
    private String genero;
    
    
    public Atributos(String nombreCancion,int iD,double duracion,String cantante,String nombreAlbum,int año,String genero ) {
        this.año = año;
        this.cantante = cantante;
        this.duracion = duracion;
        this.genero = genero;
        this.iD = iD;
        this.nombreAlbum = nombreAlbum;
        this.nombreCancion = nombreCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
