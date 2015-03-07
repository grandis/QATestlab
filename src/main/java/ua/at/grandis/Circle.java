package ua.at.grandis;

class Circle extends Figure{

    private double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigure() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw circle.");
    }

    public double getCircleLength() {
        return 2 * Math.PI * radius;
    }
}
