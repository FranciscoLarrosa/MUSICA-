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
        Coleccion b;
        int cant = 0, num = 0;
        //CREAR CANCIONES Y PLAYLIST...
        System.out.println("Ingrese 1 para crear cancion y 2 para playlist ");
        eleccion = opcion.nextInt();
        if (eleccion == 1) {
            System.out.println("Cuantas canciones quiere crear?");
            cant = opcion.nextInt();
        } else {
            if (true) {
                System.out.println("Cuantas playlist quiere crear? ");
                cant = opcion.nextInt();

            }
        }

        while (num < cant) {
            switch (eleccion) {
                case 1:
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

                    b = new Cancion(nombreCancion, album, cantante, genero, año, duracion, ID);
                    a.add(ID, b);
                    break;

                case 2:
                    System.out.println("Nombre de la playlist : ");
                    String nombrePlayList = opcion.next();
                    b = new PlayList(nombrePlayList);
                    a.add(b);
                    break;

            }
            num++;
        }

        //PONER CANCIONCES EN PLAYLIST...
        System.out.println("Ingrese el ID de la cancion y luego el nombre de la playlist donde quiere ubicarlo");
        int id =  opcion.nextInt();
        String nombrePlayList = opcion.next();
        for (Coleccion coleccion : a) {
            for (Cancion canciones : coleccion.b) {
                if (canciones.getID() == id && a.getClass().getName().equals(nombrePlayList)){
                
            }
            

        }

    }

}
