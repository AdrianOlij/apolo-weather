package com.ninjabear.apoloweather.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping("/{city}")
    public ResponseEntity<String> queryByCityName(@PathVariable String city) {
        RestTemplate restTemplate = new RestTemplate();
        String weatherApiURL = "http://api.openweathermap.org/data/2.5/weather?q=" + city +"&appid=a85abb77d6794cf639e5c143259d296f";
        return restTemplate.getForEntity(weatherApiURL, String.class);
    }



}
