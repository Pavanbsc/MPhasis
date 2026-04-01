package com.mphasis.weatherapp;

public class WeatherService {
    public String getWeather(String city) {
    	if(city.equals("Pune")) 
    		return "Hot....Sunny weather";
    	if(city.equals("Delhi")) 
    		return "foggy weather";
    	else
    		return "Unknown";
    }
}
