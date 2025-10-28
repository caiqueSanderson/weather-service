package com.infnet.alert_service.controller;

import com.infnet.alert_service.client.WeatherClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alertas")
public class AlertController {
    private final WeatherClient weatherClient;

    public AlertController(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @GetMapping
    public List<String> getAlertas() {
        var temperaturas = weatherClient.getTemperaturas();
        return temperaturas.stream()
                .filter(t -> (int) t.get("temperatura") > 28)
                .map(t -> "Alerta de calor em " + t.get("cidade"))
                .toList();
    }
}
