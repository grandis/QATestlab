package ua.at.grandis;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest extends Assert {

    @Test
    public void testGetSide(){
        Square square = new Square(2, "white");
        double temp = square.getSide();
        assertTrue(temp == 2.0);
    }

    @Test
    public void testGetPerimeter(){
        Square square = new Square(2, "white");
        double temp = square.getPerimeter();
        assertTrue(temp == 8.0);
    }

    @Test
    public void testGetDiagonal(){
        Square square = new Square(2, "white");
        double temp = square.getDiagonal();
        assertTrue(temp == 2.8284271247461903);
    }

    @Test
    public void testGetFigure(){
        Square square = new Square(2, "white");
        String temp = square.getFigure();
        assertTrue(temp.equals("Квадрат"));
    }

    @Test
    public void testGetArea(){
        Square square = new Square(2, "white");
        double temp = square.getArea();
        assertTrue(temp == 4.0);
    }
}
