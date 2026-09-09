package com.example.testqa;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinescopeTest {
    @Test
    void shouldCalculateTotalSumForTickets() {
        CinescopeService service = new CinescopeService();
        int actualPrice = service.calculateTicketPrice(350, 3);
        assertEquals(1050, actualPrice, "Стоимость 3-х билетов по 350 должна быть 1050");
    }
}