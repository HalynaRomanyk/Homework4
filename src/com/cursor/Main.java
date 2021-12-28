package com.cursor;

public class Main {

    public static void main(String[] args) {

        Shape triangle = new Triangle(new Vertex2D(3, 5), new Vertex2D(2, 8), new Vertex2D(6, 3));
        Shape rectangle = new Rectangle(new Vertex2D(2, 5), 5, 8);
        Shape circle = new Circle(new Vertex2D(6, 4), 5);
        Shape pyramid = new SquarePyramid(new Vertex3D(2, 3, 4), 3, 5);
        Shape cuboid = new Cuboid(new Vertex3D(5, 4, 7), 4, 5, 6);
        Shape sphere = new Sphere(new Vertex3D(1, 2, 3), 4);
        Shape[] shapes = new Shape[6];
        shapes[0] = triangle;
        shapes[1] = rectangle;
        shapes[2] = circle;
        shapes[3] = pyramid;
        shapes[4] = cuboid;
        shapes[5] = sphere;

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

