package com.learning.designpatterns.creational.prototype;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(Circle target){
        super();
        if(target != null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
              "radius=" + radius +
              '}';
    }
}
