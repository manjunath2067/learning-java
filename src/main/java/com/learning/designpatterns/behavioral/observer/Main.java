package com.learning.designpatterns.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // these instances are crucial because they register these observers with the WeatherData subject.
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(80,65,30);
        weatherData.setMeasurement(75,84,27);
        weatherData.setMeasurement(85,65,31);

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurement(78, 90, 29);
    }

    /**
     * Notes:
     *       The Observer  is used to create a one-to-many dependency between objects
     *       so that when one object (the subject) changes state, all its
     *       dependents (observers) are notified and updated automatically.
     *
     * Pros:  Open/Closed Principle. You can introduce new subscriber classes without having to
     *        change the publisher’s code (and vice versa if there’s a publisher interface).
     */

}
