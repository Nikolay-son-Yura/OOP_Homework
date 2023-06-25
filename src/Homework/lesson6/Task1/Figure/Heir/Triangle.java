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
        Double p = super.getPeremetr() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));    }

    @Override
    public Double getPeremetr() {
        return super.getPeremetr();
    }

//    @Override
//    public String toString() {
//        return super.toString()+
//                "\n Стороны A: "+sides[0]+
//                ",\n Стороны B: "+sides[1]+
//                ",\n Стороны C: "+sides[2]+
//                "\n Площадь треугольника: "+getArea()+
//                "\n Периметр треугольника: "+getPeremetr()
//                ;
//    }

    @Override
    public int compareTo(Figure o) {
        return this.getArea().compareTo(o.getArea());
    }
}

