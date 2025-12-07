//package com.infnet.alert_store.repository;
//
//import com.infnet.alert_store.model.Alert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//@ActiveProfiles("test")
//public class AlertRepositoryTest {
//
//    @Autowired
//    private AlertRepository repo;
//
//    @Test
//    void shouldFindByCity() {
//        repo.save(new Alert("Salvador", 30, "hot"));
//
//        List<Alert> result = repo.findByCity("Salvador");
//
//        assertEquals(1, result.size());
//        assertEquals("Salvador", result.get(0).getCity());
//    }
//}
