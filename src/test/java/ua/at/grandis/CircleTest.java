package ua.at.grandis;


import org.junit.Test;
import org.junit.Assert;

public class CircleTest extends Assert{

    @Test
    public void testGetRadius(){
        Circle circle = new Circle(5, "black");
        double temp = circle.getRadius();

        assertTrue(temp == 5.0);
    }

    @Test
    public void testGetFigure(){
        Circle circle = new Circle(5, "black");
        String temp = circle.getFigure();

        assertTrue(temp.equals("Круг"));
    }

    @Test
    public void testGetArea(){
        Circle circle = new Circle(5, "black");
        double temp = circle.getArea();

        assertTrue(temp == 78.53981633974483);
    }

    @Test
    public void testGetCircleLength(){
        Circle circle = new Circle(5, "black");
        double temp = circle.getCircleLength();

        assertTrue(temp == 31.41592653589793);
    }

    @Test
    public void testGetColor(){
        Circle circle = new Circle(5, "black");
        String temp = circle.getColor();

        assertTrue(temp.equals("black"));
    }

}
