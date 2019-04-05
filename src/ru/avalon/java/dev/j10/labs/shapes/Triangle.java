package ru.avalon.java.dev.j10.labs.shapes;

public class Triangle implements Shape, Polygon {

    private final float EDGE_A;
    private final float EDGE_B;
    private final float EDGE_C;

    private final float PERIMETER;
    private final float HP; // half PERIMETER
    private final float AREA;

    public Triangle(float EDGE_A, float EDGE_B, float EDGE_C) {
        this.EDGE_A = EDGE_A;
        this.EDGE_B = EDGE_B;
        this.EDGE_C = EDGE_C;
        PERIMETER = EDGE_A + EDGE_B + EDGE_C;
        HP = PERIMETER / 2;
        AREA = (float) Math.sqrt(HP * (HP - EDGE_A) * (HP - EDGE_B) * (HP - EDGE_C));
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
