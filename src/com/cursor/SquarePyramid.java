package com.cursor;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {

    int height, width;

    public SquarePyramid(Vertex3D v1, int height, int width) {
        this.height = height;
        this.width = width;
        this.vertices = new Vertex3D[1];
        vertices[0] = new Vertex3D(v1.x, v1.y, v1.z);
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) * width;
    }

    @Override
    public double getVolume() {
        return 2 * width / 3 * height;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "Area=" + getArea() + ", Volume=" + getVolume() +
                ", vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
