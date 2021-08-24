package com.ninjabear.apoloweather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @GetMapping
    public String welcome(){
        return "Welcome to the weather API";
    }

    @GetMapping("/{city}")
    public String queryByCity(@PathVariable String city){
        return "Querying for " + city;
    }

}
