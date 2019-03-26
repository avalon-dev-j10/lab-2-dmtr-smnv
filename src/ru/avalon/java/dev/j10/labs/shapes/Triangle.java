package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Shape, Polygon {

    private final float edgeA;
    private final float edgeB;
    private final float edgeC;

    private final float perimeter;
    private final float hP; // half perimeter
    private final float area;

    public Triangle(float edgeA, float edgeB, float edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        perimeter = edgeA + edgeB + edgeC;
        hP = perimeter / 2;
        area = (float) Math.sqrt(hP * (hP - edgeA) * (hP - edgeB) * (hP - edgeC));
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getPerimeter() {
        return perimeter;
    }

}
