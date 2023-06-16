package Homework.lesson4.Task3;

public class MinMax<T extends Comparable> {
    public T getMax(T elm1, T elm2) {
        if (elm1.compareTo(elm2) > 0) {
            return elm1;
        } else return elm2;

    }
}
