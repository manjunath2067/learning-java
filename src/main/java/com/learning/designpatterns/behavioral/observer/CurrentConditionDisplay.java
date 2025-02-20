package com.learning.designpatterns.behavioral.observer;

//ConcreteObserver
public class CurrentConditionDisplay implements Observer{

    private int temperature;
    private int humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
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
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
