package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calcSqrt() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.calc(200, 300);

        assertEquals(expected, actual);
    }
}