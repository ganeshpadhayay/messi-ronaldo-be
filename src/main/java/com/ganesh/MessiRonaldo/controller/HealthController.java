package com.ganesh.MessiRonaldo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/health")
    public String healthCheck() {
        return "ok";
    }

}