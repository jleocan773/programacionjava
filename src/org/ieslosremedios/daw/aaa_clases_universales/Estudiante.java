package org.ieslosremedios.daw.aaa_clases_universales;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable {
    public int participacion;

    public Estudiante(String nombre, String apellidos, int participacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.participacion = participacion;
    }

    public Estudiante(String nombre, int participacion){
        this.nombre = nombre;
        this.participacion = participacion;
    }

    public int getParticipacion() {
        return participacion;
    }

    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Participación: " + getParticipacion() ;
    }
}
