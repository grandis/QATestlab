package ua.at.grandis;

import org.junit.Assert;
import org.junit.Test;

public class TrapeziumTest extends Assert {

    @Test
    public void testGetFigure(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        String temp = trapezium.getFigure();
        assertTrue(temp.equals("Трапеция"));
    }

    @Test
    public void testGetArea(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getArea();
        assertTrue(temp == 16.0);
    }

    @Test
    public void testGetMiddleLine(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getMiddleLine();
        assertTrue(temp == 4.0);
    }

    @Test
    public void testGetC(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getC();
        assertTrue(temp == 5.656854249492381);
    }

    @Test
    public void testGetA(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getA();
        assertTrue(temp == 5);
    }

    @Test
    public void testGetB(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getB();
        assertTrue(temp == 3);
    }

    @Test
    public void testGetH(){
        Trapezium trapezium = new Trapezium(5, 3, 4, "green");
        double temp = trapezium.getH();
        assertTrue(temp == 4);
    }
}
