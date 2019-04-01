package ru.avalon.java.dev.j10.labs.shapes;

public interface Shape {

    float getArea();

    default short getRotation() {
        return 0;
    }

}
