package com.cursor;

import java.util.Arrays;

public class Cuboid extends SpaceShape {

    int height, width, depth;

    public Cuboid(Vertex3D v1, int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.vertices = new Vertex3D[1];
        vertices[0] = new Vertex3D(v1.x, v1.y, v1.z);
    }

    @Override
    public double getArea() {
        return 2 * (height * width + height * depth + width * depth);
    }

    @Override
    public double getVolume() {
        return height * width * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "Area=" + getArea() + ", Volume=" + getVolume() +
                ", vertices=" + Arrays.toString(vertices) +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
