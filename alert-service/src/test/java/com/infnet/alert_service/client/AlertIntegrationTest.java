//package com.infnet.alert_service.client;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureWireMock(port = 0)
//public class AlertIntegrationTest {
//    @Autowired
//    private TestRestTemplate rest;
//
//    @Test
//    void shouldCallWeatherAndStore() {
//
//        stubFor(get(urlEqualTo("/temperatures"))
//                .willReturn(okJson("""
//                    [
//                      {"city":"Salvador", "temperature":31},
//                      {"city":"SP", "temperature":25}
//                    ]
//                """)));
//
//        stubFor(post(urlEqualTo("/alerts"))
//                .willReturn(ok()));
//
//        var response = rest.getForEntity("/alerts", List.class);
//
//        assertEquals(200, response.getStatusCode().value());
//        assertEquals(1, response.getBody().size());
//    }
//}
