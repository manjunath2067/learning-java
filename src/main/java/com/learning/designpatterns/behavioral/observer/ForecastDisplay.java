package com.learning.designpatterns.behavioral.observer;

//ConcreteObserver
public class ForecastDisplay implements Observer {

    private int currentPressure = 29;
    private int lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }


    @Override
    public void update(
          int temperature,
          int humidity,
          int pressure
    )
    {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    private void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

