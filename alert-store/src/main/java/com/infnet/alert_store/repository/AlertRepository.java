package com.infnet.alert_store.repository;

import com.infnet.alert_store.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByCity(String city);
}
