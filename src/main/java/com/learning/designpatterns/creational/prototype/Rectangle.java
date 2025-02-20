package com.learning.designpatterns.creational.prototype;

public class Rectangle implements Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super();
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
              "width=" + width +
              ", height=" + height +
              '}';
    }
}
