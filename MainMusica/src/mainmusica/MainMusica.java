/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmusica;

import java.util.ArrayList;
import java.util.List;
public class MainMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PlayList a = new PlayList();
        Atributos c = new Atributos("nombreCancion", 1, 2.3, "baraku", "nombreAlbum", 2000, "chuli");
        Cancion b = new Cancion(c);
       
      //  System.out.println(a.mostrarCanciones());
       
       List <Cancion> canciones = new ArrayList(); 
         System.out.println("comienzo");
       for (Cancion elementos : canciones) {
             System.out.println ("ID : "+elementos.getID()+"\n Titulo : "+elementos.getNombreCancion()+"\n Artista : "+elementos.getCantante()+"\n Album : "+elementos.getNombreAlbum()+"\n Duracion : "+elementos.getDuracion());
       
       }
        System.out.println("final");
    }
    
}
