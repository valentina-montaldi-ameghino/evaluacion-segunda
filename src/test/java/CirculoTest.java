package test.java;

import main.java.Circulo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by damian on 26/08/16.
 */
public class CirculoTest {
   @Test
    public void crearCirculo(){
        Circulo circulo = new Circulo(5);

        Assert.assertEquals(circulo.radio, 5,0);
    }
/*
    @Test
    public void calcularArea(){
        Circulo circulo = new Circulo(10);
        Assert.assertEquals((Math.PI*10*10) , circulo.area(),0);
    }

    @Test
    public void calcularPerimetro(){
        Circulo circulo = new Circulo(10);
        Assert.assertEquals((Math.PI*10) , circulo.perimetro(),0);
    }*/
}
