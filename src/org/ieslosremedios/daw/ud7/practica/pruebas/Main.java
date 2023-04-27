package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends OperacionesApp {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
        Estudiante JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);

        //exportarXML(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml");
        //importarXML("src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/pruebas/prueba.xml");
        seleccionarAleatorio(listaEstudiantes, "src/org/ieslosremedios/daw/ud7/practica/pruebas/pruebas.txt");


    }



}
