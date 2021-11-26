package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCountNum() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.calc(200, 300);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountNumNoResult() {
        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.calc(10, 99);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCountNumOneResult() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.calc(10, 100);

        assertEquals(expected, actual);

    }
}