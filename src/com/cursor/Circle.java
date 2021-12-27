package com.cursor;

import java.util.Arrays;

public class Circle extends PlaneShape {
    int radius;

    public Circle(Vertex2D v1, int radius) {
        this.radius = radius;
        this.vertices = new Vertex3D[1];
        vertices[0] = new Vertex3D(v1.x, v1.y, 0);

    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "vertices=" + Arrays.toString(vertices) + getArea() + getPerimeter() +
                '}';
    }

}

