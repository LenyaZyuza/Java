package Homework.HW4;

import java.util.Iterator;
import java.util.LinkedList;


// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);

        int sum = 0;
        Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                sum += iterator.next();
            }
        System.out.println("Сумма всех элементов списка:" + sum);
    }
}