/**
 *
 * @author Семенов Дмитрий
 * ПП.Разработчик ПО (Java) [весна 2019-1]
 *
 */
package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Shape[] shapes = new Shape[10];

        shapes[0] = new Circle(random.nextInt(9) + 1);
        shapes[1] = new Circle(random.nextInt(9) + 1);
        shapes[2] = new Circle(random.nextInt(9) + 1);
        shapes[3] = new Rectangle(random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[4] = new Rectangle(random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[5] = new Rectangle(random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[6] = new Rectangle(random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[7] = new Triangle(random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[8] = new Triangle(random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1);
        shapes[9] = new Triangle(random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1);

        Shape max = searcher(shapes); // объект массива shapes с наибольшей площадью

    }

    /**
     *
     * Вычисляет наибольший (по площади) объект массива
     *
     * @param arr - принимаемый массив типа Shape
     * @return - наибольший элемент массива типа Shape
     *
     */
    public static Shape searcher(Shape[] arr) {
        Shape biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAREA() > biggest.getAREA()) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
