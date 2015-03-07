package ua.at.grandis;

import java.util.ArrayList;
import java.util.Random;

public class QATestlab {
    public static void main(String[] args) {
        String[] colors = {"черный", "белый", "красный", "зеленый", "синий", "желтый"};
        Random rand = new Random();
        ArrayList<Figure> randomFigures = new ArrayList<Figure>();

        //итоговое количество фигур в массиве
        int figuresAmount = rand.nextInt(5)+5;
        //наполняем массив рандомными фигурами
        for (int i = 0; i < figuresAmount; i++) {
            switch (rand.nextInt(4)) {
                case 0:
                    randomFigures.add(new Square(rand.nextInt(50) + 5, colors[rand.nextInt(5)]));
                    break;
                case 1:
                    randomFigures.add(new Circle(rand.nextInt(50) + 5, colors[rand.nextInt(5)]));
                    break;
                case 2:
                    randomFigures.add(new Triangle(rand.nextInt(50) + 5, rand.nextInt(50) + 5, colors[rand.nextInt(5)]));
                    break;
                case 3:
                    randomFigures.add(new Trapezium(rand.nextInt(30) + 30, rand.nextInt(20) + 10, rand.nextInt(50) + 5, colors[rand.nextInt(5)]));
                    break;
            }
        }

        randomFigures.trimToSize();
        System.out.println();
        System.out.println("Всего фигур: " + randomFigures.size() + ". ");
        System.out.println();

        for (int i = 0; i < randomFigures.size(); i++) {
            Figure currentFigure = randomFigures.get(i);
            System.out.print(i + 1 + "). " + currentFigure.getFigure() + ". ");
            System.out.printf("Цвет: %s. ", currentFigure.getColor());
            System.out.printf("Площадь: %.1f кв.ед. ", currentFigure.getArea());

            if(currentFigure.getFigure().equals("Квадрат")) {
                Square currentSquare = (Square)currentFigure;
                System.out.printf("Длина стороны: %.1f ед. ", currentSquare.getSide());
            } else if (currentFigure.getFigure().equals("Круг")) {
                Circle currentCircle = (Circle)currentFigure;
                System.out.printf("Длина окружности: %.1f ед. ", currentCircle.getCircleLength());
            } else if (currentFigure.getFigure().equals("Треугольник")) {
                Triangle currentTriangle = (Triangle)currentFigure;
                System.out.printf("Гипотенуза: %.1f ед. ", currentTriangle.getHypotenuse());
            } else if (currentFigure.getFigure().equals("Трапеция")) {
                Trapezium currentTrapezium = (Trapezium)currentFigure;
                System.out.printf("Средняя линия: %.1f ед. ", currentTrapezium.getMiddleLine());
            }
            System.out.println();
        }
    }
}
