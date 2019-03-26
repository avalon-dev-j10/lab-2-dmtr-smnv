package ru.avalon.java.dev.j10.labs.shapes;

public class Rectangle implements Shape, Polygon {

    private final float edgeA;
    private final float edgeB;
    private final float edgeC;
    private final float edgeD;

    private final float perimeter;
    private final float area;

    public Rectangle(float edgeA, float edgeB) {
        this.edgeA = edgeA;
        edgeC = edgeA;
        this.edgeB = edgeB;
        edgeD = edgeB;
        perimeter = edgeA + edgeB + edgeC + edgeD;
        area = edgeA * edgeB;
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
