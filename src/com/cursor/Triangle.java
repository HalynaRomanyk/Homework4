package com.cursor;

import java.util.Arrays;

public class Triangle extends PlaneShape {
    public Triangle(Vertex2D v1, Vertex2D v2, Vertex2D v3) {
        this.vertices = new Vertex3D[3];
        vertices[0] = new Vertex3D(v1.x, v1.y, 0);
        vertices[1] = new Vertex3D(v2.x, v2.y, 0);
        vertices[2] = new Vertex3D(v3.x, v3.y, 0);
    }

    @Override
    public double getArea() {
        int x1 = vertices[0].x;
        int y1 = vertices[0].y;
        int x2 = vertices[1].x;
        int y2 = vertices[1].y;
        int x3 = vertices[2].x;
        int y3 = vertices[2].y;

        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        return (a + b) / 2;
    }

    @Override
    public double getPerimeter() {
        int x1 = vertices[0].x;
        int y1 = vertices[0].y;
        int x2 = vertices[1].x;
        int y2 = vertices[1].y;
        int x3 = vertices[2].x;
        int y3 = vertices[2].y;

        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() +
                ", vertices=" + Arrays.toString(vertices) + '}';
    }
}



