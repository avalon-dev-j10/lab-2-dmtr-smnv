package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Point, Shape, Ellipse {

    private float x; // on center
    private float y; // on circle
    private final float radius;
    private final float area;

    public Circle(float radius) {
        this.radius = radius;
        area = (float) (Math.PI * radius * radius);
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getLength() {
        return (float) (2 * Math.PI * radius); // длина окружности
    }

}
