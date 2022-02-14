package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"ordinaryRange, 200, 300, 3",
            "lowRange, 50, 99, 0",
            "highRange, 9802, 10000, 0",
            "oneRange, 220, 250, 1",
            "allRange, 100, 9801, 90"})
    void shouldsqrRange(String testName, int number1, int number2, int expected) {

        SQRService service = new SQRService();

        int actual = service.sqrRange(number1, number2);//фактический результат

        assertEquals(expected, actual);//сравниваем ожидаемый и фактический результаты


    }
}