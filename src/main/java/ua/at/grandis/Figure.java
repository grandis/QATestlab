package ua.at.grandis;

class Figure {

    private String color;

    Figure (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFigure() {
        return "Фигура";
    }

    public double getArea() {
        return 1;
    }

    public void drawFigure() {
        System.out.println("Draw figure.");
    }
}
