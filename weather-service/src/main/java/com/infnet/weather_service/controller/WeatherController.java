package com.infnet.weather_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/temperaturas")
public class WeatherController {
        @GetMapping
        public List<Map<String, Object>> getTemperaturas() {
            return List.of(
                    Map.of("cidade", "Salvador", "temperatura", 30),
                    Map.of("cidade", "Rio de Janeiro", "temperatura", 27),
                    Map.of("cidade", "São Paulo", "temperatura", 25)
            );
    }
}
