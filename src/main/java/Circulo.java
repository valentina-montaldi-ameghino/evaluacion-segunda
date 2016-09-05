package main.java;

/**
 * Created by alumno on 05/09/16.
 */
public class Circulo implements Figura {
    public double radio;

    public Circulo(int radio) {
    this.radio= radio;
    }

    public double area() {
        double areat= (Math.PI * radio * radio);
        return (areat);
    }

    public double perimetro() {
        double perimetro = (Math.PI * radio);
        return  (perimetro);
    }
}
