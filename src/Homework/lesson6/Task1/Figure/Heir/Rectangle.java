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
        return sides[0] * sides[1];
    }


    @Override
    public Double getPeremetr() {
        return super.getPeremetr();
    }

//    @Override
//    public String toString() {
//        return super.toString() +
//                "\n Стороны A: " + sides[0] +
//                ",\n Стороны B: " + sides[1] +
//                "\n Периметр: " + getPeremetr() +
//                "\n Площадь: " + getArea();
//    }

    @Override
    public int compareTo(Figure o) {
        return this.getArea().compareTo(o.getArea());
    }



}
