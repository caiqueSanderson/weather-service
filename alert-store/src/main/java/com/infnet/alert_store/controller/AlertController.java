package com.infnet.alert_store.controller;

import com.infnet.alert_store.dto.AlertRequest;
import com.infnet.alert_store.model.Alert;
import com.infnet.alert_store.repository.AlertRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertController {
    private final AlertRepository repository;

    public AlertController(AlertRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Alert> create(@RequestBody AlertRequest request) {
        Alert alert = new Alert(request.city(), request.temperature(), request.message());
        return ResponseEntity.ok(repository.save(alert));
    }

    @GetMapping
    public ResponseEntity<List<Alert>> all() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<Alert>> byCity(@PathVariable String city) {
        return ResponseEntity.ok(repository.findByCity(city));
    }
}
