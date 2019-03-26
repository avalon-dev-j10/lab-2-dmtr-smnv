package ru.avalon.java.dev.j10.labs.shapes;

public interface Shape {

    float getArea();

    /**
     * Возвращает дефолтное значение 0, если объект не поддерживает вращение
     *
     * @return - угол вращения от 0 до 360
     *
     */
    default short getRotation() {
        return 0;
    }

}
