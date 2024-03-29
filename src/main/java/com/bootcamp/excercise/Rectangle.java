package com.bootcamp.excercise;

// understands a polygon with 4 sides with perpendicular adjacent sides
public class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Rectangle)) return false;
        Rectangle object = (Rectangle) o;
        if (!(this.length == object.length && this.breadth == object.breadth)) return false;
        return true;
    }
}