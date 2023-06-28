package com.klyucherov.test;

import com.klyucherov.test.sevice.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.DigestException;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    public void plusTest() {
        Number actual = calculatorService.plus(5, 5);
        Number expected = 10;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.plus(-1, 2);
        expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(5, 5);
        Number expected = 0;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.minus(-1, 2);
        expected = -3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void multiplicationTest() {
        Number actual = calculatorService.multiplication(5, 5);
        Number expected = 25;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.multiplication(-1, 2);
        expected = -2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divisionTest() {
        Number actual = calculatorService.division(1, 2);
        Number expected = 0.5;

        Assertions.assertEquals(expected, actual);

        actual = calculatorService.division(-1, 2);
        expected = -0.5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divisionNegativeTest() {
        Assertions.assertThrows(DigestException.class, () -> calculatorService.division(5, 5));
        Assertions.assertThrows(DigestException.class, () -> calculatorService.division(-1, 0));

    }


}
