package com.infnet.alert_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "weather-service", url = "http://localhost:8080")
public interface WeatherClient {
        @GetMapping("/temperaturas")
        List<Map<String, Object>> getTemperaturas();
}
