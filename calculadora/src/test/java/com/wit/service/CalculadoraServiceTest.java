package com.wit.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    public void testAdd() {
        BigDecimal result = calculadoraService.add(BigDecimal.valueOf(10), BigDecimal.valueOf(5));
        assertEquals(BigDecimal.valueOf(15), result, "10 + 5 deve ser 15");
    }

    @Test
    public void testSubtract() {
        BigDecimal result = calculadoraService.subtract(BigDecimal.valueOf(10), BigDecimal.valueOf(5));
        assertEquals(BigDecimal.valueOf(5), result, "10 - 5 deve ser 5");
    }

    @Test
    public void testMultiply() {
        BigDecimal result = calculadoraService.multiply(BigDecimal.valueOf(10), BigDecimal.valueOf(5));
        assertEquals(BigDecimal.valueOf(50), result, "10 * 5 deve ser 50");
    }

    @Test
    public void testDivide() {
        BigDecimal result = calculadoraService.divide(BigDecimal.valueOf(10), BigDecimal.valueOf(5));
        assertEquals(BigDecimal.valueOf(2), result, "10 / 5 deve ser 2");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadoraService.divide(BigDecimal.valueOf(10), BigDecimal.valueOf(0));
        }, "Divisão por zero deve lançar ArithmeticException");
    }
}