package test.java;

import main.java.DummyClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by damian on 26/08/16.
 */
public class DummyTest {

    @Test
    public void dummyTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void dummClass(){
        DummyClass d = new DummyClass("hello");

        Assert.assertEquals("hello", d.variable);
    }


}
