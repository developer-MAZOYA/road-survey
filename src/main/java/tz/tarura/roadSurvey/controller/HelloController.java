package tz.tarura.roadSurvey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Docker with Spring Boot!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}