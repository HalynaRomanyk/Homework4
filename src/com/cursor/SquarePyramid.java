package com.cursor;

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
        return width*2+height*8;
    }

    @Override
    public double getVolume() {
        return 2*width/3*height;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "height=" + height + getArea() + getVolume()+
                ", width=" + width +
                '}';
    }
}
