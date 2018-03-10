package mainmusica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMusica {

    public static void main(String[] args) {
        // variables---
        Scanner opcion = new Scanner(System.in);
        List<Coleccion> a = new ArrayList();
        int eleccion;
        PlayList defaultt = new PlayList("Default");

        int cant = 0, num = 0;
        
        
        
        
        //CREAR PLAYLIST
        
        System.out.println("Nombre de la playlist : ");
        String nombrePlayList = opcion.next();
        PlayList c = new PlayList(nombrePlayList);
        defaultt.addElemento(c);
        
        //CREAR CANCION
        
        String nombreCancion,
                album,
                cantante,
                genero;
        int año,
                duracion,
                ID;
        System.out.println("ingrese nombre de la cancion : ");
        nombreCancion = opcion.next();
        System.out.println("nombre del album  ");
        album = opcion.next();
        System.out.println("cantante : ");
        cantante = opcion.next();
        System.out.println("genero : ");
        genero = opcion.next();
        System.out.println("año de la cancion : ");
        año = opcion.nextInt();
        System.out.println("duracion d la cancion en seg : ");
        duracion = opcion.nextInt();
        System.out.println("Ingrese su ID ");
        ID = opcion.nextInt();

        Cancion unaCancion = new Cancion(nombreCancion, album, cantante, genero, año, duracion, ID);
        
        c.addElemento(unaCancion);
        
        System.out.println("Nombre de la playlist : ");
        String nombrePlayList2 = opcion.next();
        PlayList d = new PlayList(nombrePlayList);
        defaultt.addElemento(d);
        
        d.addElemento(c);
        
        System.out.println("ingrese nombre de la cancion : ");
        nombreCancion = opcion.next();
        System.out.println("nombre del album  ");
        album = opcion.next();
        System.out.println("cantante : ");
        cantante = opcion.next();
        System.out.println("genero : ");
        genero = opcion.next();
        System.out.println("año de la cancion : ");
        año = opcion.nextInt();
        System.out.println("duracion d la cancion en seg : ");
        duracion = opcion.nextInt();
        System.out.println("Ingrese su ID ");
        ID = opcion.nextInt();

        Cancion unaCancion2 = new Cancion(nombreCancion, album, cantante, genero, año, duracion, ID);
        
        d.addElemento(unaCancion2);
        

    }

    


}
