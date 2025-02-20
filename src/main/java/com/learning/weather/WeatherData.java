package com.learning.weather;

import java.util.List;

public class WeatherData {
    private String name;
    private List<Weather> weather;
    private Main main;
    private Wind wind;

    public String getName() {
        return name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }
}

