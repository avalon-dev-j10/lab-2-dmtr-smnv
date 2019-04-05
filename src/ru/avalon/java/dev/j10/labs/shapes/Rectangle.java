package ru.avalon.java.dev.j10.labs.shapes;

public class Rectangle implements Shape, Polygon {

    private final float EDGE_A;
    private final float EDGE_B;
    private final float EDGE_C;
    private final float EDGE_D;

    private final float PERIMETER;
    private final float AREA;

    public Rectangle(float EDGE_A, float EDGE_B) {
        this.EDGE_A = EDGE_A;
        EDGE_C = EDGE_A;
        this.EDGE_B = EDGE_B;
        EDGE_D = EDGE_B;
        PERIMETER = EDGE_A + EDGE_B + EDGE_C + EDGE_D;
        AREA = EDGE_A * EDGE_B;
    }

    @Override
    public float getAREA() {
        return AREA;
    }

    @Override
    public float getPERIMETER() {
        return PERIMETER;
    }

}
