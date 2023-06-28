package Homework.lesson6.Task1.Figure.Heir;

import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

public class Triangle extends Polygon {

        public Triangle(String name, Double a, Double b, Double c) {//тут тоже надо бы сделать отдельный класс по ошибкам
        super(name,3, new Double[]{a, b, c});
            if (!(a + b > c && a + c > b && b + c > a))
                throw new IllegalArgumentException("Невозможно создать треугольник с заданными сторонами!");
        }


    @Override
    public Double getArea() {
        Double p =getPerimeter() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public int compareTo(Figure o) {
        double area = getArea();
        double otherArea = o.getArea();
        return Double.compare(area, otherArea);
    }
//        return this.getArea().compareTo(o.getArea()); }
}

