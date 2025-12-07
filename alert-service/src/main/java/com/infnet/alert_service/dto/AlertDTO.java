package com.infnet.alert_service.dto;

public class AlertDTO {
    private String city;
    private Integer temperature;
    private String message;

    public AlertDTO() {}

    public AlertDTO(String city, Integer temperature, String mensagem) {
        this.city = city;
        this.temperature = temperature;
        this.message = mensagem;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public Integer getTemperature() { return temperature; }
    public void setTemperature(Integer temperature) { this.temperature = temperature; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
