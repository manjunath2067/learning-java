package com.learning.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(6);
        Circle clonedCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(clonedCircle);

        System.out.println(circle.hashCode());
        System.out.println(clonedCircle.hashCode());

        System.out.println(circle.clone());

    }

    // this pattern copies the existing objects without making your code dependent on their classes



    /**
    Notes:

    Pros:
    1. Reduces the cost of creating objects - Cloning can be more efficient than creating a new object from scratch(video game characters)
    2. Simplifies the creation of complex objects - Allows the creation of new objects based on a prototype
                                                    without knowing their specific types.

    Cons:
    1. If an object has many references to other objects, implementing the clone operation can be complicated.
    2. Requires Careful Handling of Deep vs. Shallow Copies
            ex:
             @Override public Shape cloneShape() {
             try {
                    return (Rectangle) super.clone(); // Shallow copy
             } catch (CloneNotSupportedException e) {
                    return null;
                }
             }
     --------------------------------------------------------------------------
     @Override
     public Shape cloneShape() {
     // Create a new Rectangle with a new Point instance
        return new Rectangle(width, height, new Point(topLeft.x, topLeft.y)); // Deep copy
     }
     */

}
