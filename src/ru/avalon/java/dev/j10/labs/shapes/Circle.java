package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Shape, Ellipse {

    private final float RADIUS;
    private final float AREA;

    public Circle(float radius) {
        this.RADIUS = radius;
        AREA = (float) (Math.PI * radius * radius);
    }

    @Override
    public float getAREA() {
        return AREA;
    }

    @Override
    public float getLength() {
        return (float) (2 * Math.PI * RADIUS); // длина окружности
    }

}
