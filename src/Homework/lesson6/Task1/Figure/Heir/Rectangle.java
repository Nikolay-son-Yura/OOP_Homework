package Homework.lesson6.Task1.Figure.Heir;

import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

public class Rectangle extends Polygon {


    public Rectangle(String name, Double a, Double b){//тут тоже надо бы сделать отдельный класс по ошибкам
        super(name, 4, new Double[]{a, b, a, b});
        if (a.equals(b))
            throw new IllegalArgumentException("Получается квадрат");
    }


    @Override
    public Double getArea() {
        return sides[0] * sides[0];
    }


    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public int compareTo(Figure o) {
        return this.getArea().compareTo(o.getArea());
    }



}
