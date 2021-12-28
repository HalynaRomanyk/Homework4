package com.cursor;

import java.util.Arrays;

public class Sphere extends SpaceShape {

    int radius;

    public Sphere(Vertex3D v1, int radius) {
        this.radius = radius;
        this.vertices = new Vertex3D[1];
        vertices[0] = new Vertex3D(v1.x, v1.y, v1.z);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "Area=" + getArea() + ", Volume=" + getVolume() +
                ", vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                '}';
    }
}
