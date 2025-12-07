package com.infnet.alert_service.client;

import com.infnet.alert_service.dto.AlertDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "alert-store",url = "http://alert-store:8090")
public interface AlertStoreClient {
    @PostMapping("/alerts")
    void saveAlert(AlertDTO alertDTO);
}
