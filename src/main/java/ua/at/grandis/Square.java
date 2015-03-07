package ua.at.grandis;

class Square extends Figure{

    private double side;

    Square (double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double a) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }

    @Override
    public String getFigure() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Draw square.");
    }
}
