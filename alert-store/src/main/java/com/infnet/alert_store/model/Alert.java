package com.infnet.alert_store.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "alerts")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private Integer temperature;
    private String message;

    private OffsetDateTime createdAt;

    public Alert() {}

    public Alert(String city, Integer temperature, String message) {
        this.city = city;
        this.temperature = temperature;
        this.message = message;
        this.createdAt = OffsetDateTime.now();
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getCity() { return city; }
    public void setCity(String city) {this.city = city;}

    public Integer getTemperature() { return temperature; }
    public void setTemperature(Integer temperature) { this.temperature = temperature; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public OffsetDateTime getCreatedAt() { return createdAt; }
}
