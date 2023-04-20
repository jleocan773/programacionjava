package org.ieslosremedios.daw.alumnoaleatorio;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pruebas {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 0),
                JuanMaria = new Estudiante("Juan María Mateos Ponce", 0),
                Victor = new Estudiante("Victor Chacón Calle", 0),
                Jose = new Estudiante("José Ramirez Sanchez", 0),
                Jorge = new Estudiante("Jorge Coronil Villalba", 0),
                Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 0),
                Adrian = new Estudiante("Adrián Merino Gamaza", 0),
                JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Diego = new Estudiante("Diego González Romero", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0),
                JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", 0),
                Julian = new Estudiante("Julian García Velázquez", 0),
                JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0),
                AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 0);


        final String ruta = "C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\estudiantes.txt";
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);
        //System.out.println(listaEstudiantes);

        //Opciones para el menú:
        //crearFicheroEstudiantes(listaEstudiantes, ruta);
        //System.out.println(leerFicheroEstudiantes(ruta));
        //System.out.println(seleccionarAleatorio(listaEstudiantes, ruta));
    }


    public static void crearFicheroEstudiantes(List<Estudiante> listaEstudiantes, String ruta) throws IOException {
        FileOutputStream writeData = new FileOutputStream(ruta);
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

        writeStream.writeObject(listaEstudiantes);
        writeStream.flush();
        writeStream.close();
    }

    public static List<Estudiante> leerFicheroEstudiantes(String ruta) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(ruta);
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) readStream.readObject();
        readStream.close();
        return estudiantes;
    }

    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String ruta) throws IOException, ClassNotFoundException {
        estudiantes.clear();
        estudiantes = leerFicheroEstudiantes(ruta);

        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        if (estudiantes.get(elegido).participacion > 50) {
            elegido = random.nextInt(estudiantes.size());
            System.out.println("Se ha elegido a " + estudiantes.get(elegido) + "ahora su participación es " + estudiantes.get(elegido).participacion);

            FileOutputStream writeData = new FileOutputStream(ruta);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(estudiantes);
            writeStream.flush();
            writeStream.close();

            return estudiantes.get(elegido);
        }
        else  estudiantes.get(elegido).participacion++;
        System.out.println("Se ha elegido a " + estudiantes.get(elegido).nombre + " ahora su participación es " + estudiantes.get(elegido).participacion);
        FileOutputStream writeData = new FileOutputStream(ruta);
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

        writeStream.writeObject(estudiantes);
        writeStream.flush();
        writeStream.close();

        return (estudiantes.get(elegido));
    }



}
