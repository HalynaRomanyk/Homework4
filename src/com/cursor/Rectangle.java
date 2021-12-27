package com.cursor;

import java.util.Arrays;

public class Rectangle extends PlaneShape {

    int height, width;

    public Rectangle(Vertex2D v1, int height, int width) {
        this.height = height;
        this.width = width;
        this.vertices = new Vertex3D[1];
        vertices[0] = new Vertex3D(v1.x, v1.y, 0);

    }

    @Override
    public double getArea() {
         return height*width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "vertices=" + Arrays.toString(vertices) + getArea() + getPerimeter() +
                '}';
    }
}

