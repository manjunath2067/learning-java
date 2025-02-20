package com.learning.weather;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class WeatherApp {

    private static final String API_KEY = "beda5bc585d56eb0608174ddbd20265f";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String cityName = "Bangalore";
        getWeather(cityName);
    }

    private static void getWeather(String cityName) {
        OkHttpClient client = new OkHttpClient();
        String apiUrl = buildApiUrl(cityName);

        Request request = new Request.Builder()
              .url(apiUrl)
              .build();

        try
        {
            Response response = client.newCall(request).execute();
            if(response.isSuccessful()){
                String responseBody = response.body().string();
                WeatherData weatherData = parseJson(responseBody);
                displayWeatherInfo(weatherData);
            }
            else{
                System.out.println("Error:"+response.code()+"-"+response.message());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void displayWeatherInfo(WeatherData weatherData) {
        System.out.println("Weather in " + weatherData.getName() + ":");
        System.out.println("Description: " + weatherData.getWeather().get(0).getDescription());
        System.out.println("Temperature: " + weatherData.getMain().getTemp() + " °C");
        System.out.println("Humidity: " + weatherData.getMain().getHumidity() + "%");
        System.out.println("Wind Speed: " + weatherData.getWind().getSpeed() + " m/s");
    }

    private static String buildApiUrl(String cityName) {
        return String.format("%s?q=%s&appid=%s", API_URL, cityName, API_KEY);
    }

    private static WeatherData parseJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, WeatherData.class);
    }

}
