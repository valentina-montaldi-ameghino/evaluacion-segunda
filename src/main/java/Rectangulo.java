package main.java;

/**
 * Created by alumno on 05/09/16.
 */
public class Rectangulo implements Figura {
    public int base;
    public int  altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;

    }

    public double area() {
    double areat = base * altura;
        return (areat);
    }

    public double perimetro() {
        double perimetrot = base * 2 + altura*2;
        return (perimetrot);
    }
}
