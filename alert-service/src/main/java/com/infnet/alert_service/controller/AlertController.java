package com.infnet.alert_service.controller;

import com.infnet.alert_service.client.AlertStoreClient;
import com.infnet.alert_service.client.WeatherClient;
import com.infnet.alert_service.dto.AlertDTO;
import com.infnet.alert_service.service.AlertService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertController {
    private final AlertService service;

    public AlertController(AlertService service) {
        this.service = service;
    }

    @GetMapping
    public List<String> getAlerts() {
        return service.processAlerts();
    }
}
