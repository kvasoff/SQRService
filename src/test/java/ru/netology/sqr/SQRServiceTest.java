package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SQRServiceTest {
    @Test
    void includeBorder() {
        SQRService service = new SQRService();

        int leftBorder = 200;
        int rightBorder = 300;
        int expected = 3;

        int actual = service.rangeSquares(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }

    @Test
    void NotIncludeBorder() {
        SQRService service = new SQRService();

        int leftBorder = 0;
        int rightBorder = 1;
        int expected = 0;

        int actual = service.rangeSquares(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }
}
