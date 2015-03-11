package ua.at.grandis;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest extends Assert {

    @Test
    public void testGetFigure(){
        Triangle triangle = new Triangle(3, 4, "red");
        String temp = triangle.getFigure();
        assertTrue(temp.equals("Треугольник"));
    }

    @Test
    public void testGetArea(){
        Triangle triangle = new Triangle(3, 4, "red");
        double temp = triangle.getArea();
        assertTrue(temp == 6);
    }

    @Test
    public void testGetHypotenuse(){
        Triangle triangle = new Triangle(3, 4, "red");
        double temp = triangle.getHypotenuse();
        assertTrue(temp == 5);
    }

    @Test
    public void testGetA(){
        Triangle triangle = new Triangle(3, 4, "red");
        double temp = triangle.getA();
        assertTrue(temp == 3);
    }

    @Test
    public void testGetB(){
        Triangle triangle = new Triangle(3, 4, "red");
        double temp = triangle.getB();
        assertTrue(temp == 4);
    }
}
