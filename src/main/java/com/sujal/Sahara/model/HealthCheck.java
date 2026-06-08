package com.sujal.Sahara.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Server is running successfully!";
    }
}
