package com.learning.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteObservable class
public class WeatherData implements Observable{

    private List<Observer> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(
          int temperature,
          int humidity,
          int pressure
    )
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
