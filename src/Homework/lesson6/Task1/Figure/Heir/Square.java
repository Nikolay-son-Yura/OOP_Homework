package Homework.lesson6.Task1.Figure.Heir;


import Homework.lesson6.Task1.Figure.Parent.Figure;
import Homework.lesson6.Task1.Figure.Parent.Polygon;

public class Square extends Polygon {//тут тоже надо бы сделать отдельный класс по ошибкам
    public Square(String name, Double a) {
        super(name, 4, new Double[]{a, a, a, a});
    }


    @Override
    public Double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public Double getPeremetr() {
        return super.getPeremetr();
    }

    @Override
    public int compareTo(Figure o) {
        return this.getArea().compareTo(o.getArea());
    }
}
