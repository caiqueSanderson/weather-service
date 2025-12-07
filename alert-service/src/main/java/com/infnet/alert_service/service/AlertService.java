package com.infnet.alert_service.service;

import com.infnet.alert_service.client.AlertStoreClient;
import com.infnet.alert_service.client.WeatherClient;
import com.infnet.alert_service.dto.AlertDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {
    private final WeatherClient weatherClient;
    private final AlertStoreClient alertStoreClient;

    public AlertService(WeatherClient weatherClient, AlertStoreClient alertStoreClient) {
        this.weatherClient = weatherClient;
        this.alertStoreClient = alertStoreClient;
    }

    public List<String> processAlerts() {
        var temps = weatherClient.getTemperatures();

        return temps.stream()
                .filter(t -> t.temperature() > 28)
                .map(t -> {
                    String msg = "Alerta de calor em " + t.city();

                    alertStoreClient.saveAlert(new AlertDTO(t.city(), t.temperature(), msg));
                    return msg;
                })
                .toList();
    }
}
