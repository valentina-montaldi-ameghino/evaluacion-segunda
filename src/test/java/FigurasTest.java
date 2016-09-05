package test.java;

import main.java.Circulo;
import main.java.Cuadrado;
import main.java.Figura;
import main.java.Rectangulo;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class FigurasTest{

    @Test
    public void calcularArea() {
        Rectangulo fig = new Rectangulo(5,10);
        Assert.assertEquals(50, fig.area(), 0);

    }

    @Test
    public void calcularPerimetro() {
        Circulo fig = new Circulo(10);

        Assert.assertEquals(Math.PI*10, fig.perimetro(),0);

    }

    @Test
    public void calcularAreas(){
        Cuadrado cuadrado = new Cuadrado(1);
        Figura fig  = new Cuadrado(5);
        Figura fig2 = new Rectangulo(5,10);
        Figura fig3 = new Circulo(20);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(fig);
        figuras.add(fig2);
        figuras.add(fig3);

        Assert.assertEquals(1331, cuadrado.sumarAreasDeFiguras(figuras),10);
    }
}
