//package com.infnet.alert_service.service;
//
//import com.infnet.alert_service.client.AlertStoreClient;
//import com.infnet.alert_service.client.WeatherClient;
//import com.infnet.alert_service.dto.AlertDTO;
//import com.infnet.alert_service.dto.WeatherDTO;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class AlertServiceTest {
//    @Mock
//    private WeatherClient weatherClient;
//
//    @Mock
//    private AlertStoreClient alertStoreClient;
//
//    @InjectMocks
//    private AlertService service;
//
//    @Test
//    void shouldGenerateAlertsForHighTemperatures() {
//
//        var list = List.of(
//                new WeatherDTO("Salvador", 30),
//                new WeatherDTO("RJ", 27)
//        );
//
//        when(weatherClient.getTemperatures()).thenReturn(list);
//
//        var result = service.processAlerts();
//
//        assertEquals(1, result.size());
//        verify(alertStoreClient, times(1))
//                .saveAlert(any(AlertDTO.class));
//    }
//}
