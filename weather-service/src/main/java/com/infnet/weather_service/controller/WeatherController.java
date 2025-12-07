package com.infnet.weather_service.controller;

import com.infnet.weather_service.dto.WeatherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/temperature")
public class WeatherController {
        @GetMapping
        public List<WeatherDTO> getTemperatures() {
            return List.of(
                    new WeatherDTO("Salvador", 30),
                    new WeatherDTO("Rio de Janeiro", 27),
                    new WeatherDTO("São Paulo", 25)
            );
    }
}
