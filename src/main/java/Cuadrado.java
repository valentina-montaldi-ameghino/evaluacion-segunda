package main.java;

import java.util.List;

/**
 * Created by alumno on 05/09/16.
 */
public class Cuadrado implements Figura {

    public double lado;

    public Cuadrado(int i) {
        this.lado = i;


    }


    public double area() {
        double areat = lado * lado;
        return (areat);
    }

    public double perimetro() {
        double perimetrot = lado * 4;
        return (perimetrot);
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sumarAreas = 0;
        for (Cuadrado c : cuadrados) {
            sumarAreas = sumarAreas + c.area();
        }
        return (sumarAreas);
    }



    public double sumarAreasDeFiguras(List<Figura>rectangulos) {
        double sumarAreas = 0;
        for (Figura c : rectangulos) {
            sumarAreas = sumarAreas + c.area();
        }
        return (sumarAreas);
    }
}


