package com.navodita.weatherapp;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller(value = "/")
public class Controller implements ErrorController {
    @GetMapping
    public String weather(Model model){
        String url = "https://api.open-meteo.com/v1/forecast?latitude=22.5626&longitude=88.363&current=temperature_2m,relative_humidity_2m,apparent_temperature,is_day,precipitation,rain,showers,snowfall,weather_code,cloud_cover,pressure_msl,surface_pressure,wind_speed_10m,wind_direction_10m,wind_gusts_10m&temperature_unit=fahrenheit&timezone=Asia/Bangkok";
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(url, Weather.class);
        model.addAttribute("ht", weather.getCurrent().getTemperature_2m());
        model.addAttribute("at", weather.getCurrent().getApparent_temperature());
        return "weather";
    }
}
