package org.example;


//encapsulation example

public class Duck {
    private double height;
    private double weight;

    public Duck(double height, double weight) {
        setHeight(height);
        setWeight(weight);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setter methods with encapsulation checks
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative");
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
    }

    public static void main(String[] args) {

        Duck myDuck = new Duck(12.5, 2.3);

        System.out.println("Duck's Height: " + myDuck.getHeight());
        System.out.println("Duck's Weight: " + myDuck.getWeight());

        // Trying to set negative height (will throw an exception)
        try {
            myDuck.setHeight(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Trying to set negative weight (will throw an exception)
        try {
            myDuck.setWeight(-1.8);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
