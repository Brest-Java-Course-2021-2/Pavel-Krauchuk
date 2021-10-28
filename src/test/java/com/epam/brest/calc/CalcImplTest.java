package com.epam.brest.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalcImplTest {
    Calc calc = new CalcImp();

    @Test
    void handleHandleMethod() {
        BigDecimal weight = new BigDecimal("10");
        BigDecimal weightPrice = new BigDecimal("10");
        BigDecimal lenght = new BigDecimal("10");
        BigDecimal lenghtPrice = new BigDecimal("10");
        assertNotNull(calc);
        assertEquals(new BigDecimal("200") , calc.handle(weight, weightPrice, lenght, lenghtPrice));
    }

    @Test
    void handleHandleMethodWithNullParameters() {
        assertNotNull(calc);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.handle(null, null, null, null);
        });
    }
}