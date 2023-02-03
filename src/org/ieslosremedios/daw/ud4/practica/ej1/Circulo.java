package org.ieslosremedios.daw.ud4.practica.ej1;

public class Circulo extends Geometria implements  Coloreable{
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        double area = 3.14 * (radio*radio);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 3.14 * (radio*2);
        return perimetro;
    }
}
