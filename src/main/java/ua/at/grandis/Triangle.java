package ua.at.grandis;

class Triangle extends Figure{

    private double a;
    private double b;

    Triangle (double a, double b, String color) {
        super (color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String getFigure() {
        return "Треугольник";
    }

    @Override
    public double getArea() {
        return 0.5 * a * b;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw triangle");
    }

    public double getHypotenuse() {
        return Math.sqrt(a * a + b * b);
    }
}
