package com.example.testqa.tests;


import com.example.testqa.CinescopeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class CinescopeTest {

    @ParameterizedTest
    @CsvSource ({
            "350, 3, 1050",
            "350, 1, 350",
            "350, 0, 0",
            "0, 3, 0"
    })

    void shouldCalculateTotalSumForTickets(int price, int quantity, int expectedPrice) {
        CinescopeService service = new CinescopeService();
        int actualPrice = service.calculateTicketPrice(price, quantity);
        assertThat(actualPrice)
                .as("Стоимость билетов: цена %s, количество  %s", price, quantity)
                .isEqualTo(expectedPrice);

    }
}