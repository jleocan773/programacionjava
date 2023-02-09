package org.ieslosremedios.daw.ud5.ejemplos.TreeSet;
import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class EjemploTreeSet {
    public static void main(String[] args) {
        //1.- Crea un conjunto implementado por un árbol binario
        TreeSet <Integer> treeNumeros = new TreeSet<>();

        //2.- Añade tres números enteros en orden aleatorio
        treeNumeros.add(10);
        treeNumeros.add(25);
        treeNumeros.add(5);

        System.out.print("TreeSet de tipo Integer: ");

        //3.- Recorrelo e imprime su contenido ordenado de menor a mayor
        Iterator <Integer> itInteger = treeNumeros.iterator();
        Integer e;
        while (itInteger.hasNext()){
            e = itInteger.next();
            System.out.print(e + " ");
        }
        
        //4.- Haz lo mismo para nombres
        TreeSet <String> treeNombres = new TreeSet<>();
        treeNombres.add("Zoe");
        treeNombres.add("Samuel");
        treeNombres.add("Aaron");
        treeNombres.add("Manuel");
        treeNombres.add("Berto");

        System.out.print("\nTreeSet de tipo String: ");

        Iterator <String> it1 = treeNombres.iterator();
        String s;
        while (it1.hasNext()){
            s = it1.next();
            System.out.print(s + " ");
        }

        //TreeSet de Personas

        TreeSet <Persona> treePersonas = new TreeSet<>();
        Persona p1 = new Persona("Zoe", 18);
        Persona p2 = new Persona("Samuel",19);
        Persona p3 = new Persona("Aaron", 20);
        Persona p4 = new Persona("Manuel", 25);
        Persona p5 = new Persona("Berto", 22);
            treePersonas.add(p1);
            treePersonas.add(p2);
            treePersonas.add(p3);
            treePersonas.add(p4);
            treePersonas.add(p5);

            System.out.println ("\nTreeSet de tipo Persona: ");

            for (Persona p: treePersonas) {System.out.println(p);}
    }
}


