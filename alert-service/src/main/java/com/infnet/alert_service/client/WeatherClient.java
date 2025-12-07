package com.infnet.alert_service.client;

import com.infnet.alert_service.dto.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "weather-service", url = "http://weather-service:8080")
public interface WeatherClient {
        @GetMapping("/temperature")
        List<WeatherDTO> getTemperatures();
}
