package ua.at.grandis;

import org.junit.Assert;
import org.junit.Test;

public class FigureTest extends Assert{

    @Test
    public void testGetColor(){
        Figure figure = new Figure("blue");
        String temp = figure.getColor();
        assertTrue(temp.equals("blue"));
    }
}
