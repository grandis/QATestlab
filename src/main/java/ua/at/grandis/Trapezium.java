package ua.at.grandis;

class Trapezium extends Figure{

    private double a; //нижнее основание
    private double b; //верхнее основание
    private double h; //высота

    Trapezium (double a, double b, double h, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.h = h;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    //получаем боковую сторону
    public double getC() {
        return Math.sqrt(Math.pow(h, 2) + (Math.pow(a, 2) - Math.pow(b, 2)));
    }

    //получаем среднюю линию трапеции
    public double getMiddleLine() {
        return (a + b) / 2;
    }

    @Override
    public String getFigure() {
        return "Трапеция";
    }

    @Override
    public double getArea() {
        return ((a + getB()) / 2) * h;
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw trapezium.");
    }
}
