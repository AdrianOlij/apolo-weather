package com.ninjabear.apoloweather.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GrettingsController {
    class MyString extends String{
        public String sayGoodBye(){
            return "Goodbye";
        }
    }
    @RequestMapping
    @ResponseBody
    public <T> ResponseEntity<T extends String> sayHello() {
        return new ResponseEntity<>(new MyString(), HttpStatus.OK);
    }

}
