package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sholdSqrCisellInterval() {
        SQRService service = new SQRService();
        int sqrCiselInterval = service.SqrCiselInterval(200, 400);
        int expected = 6;
        assertEquals(expected, sqrCiselInterval);
    }

    @Test
    void sholdSqrCiselInterval1() {
        SQRService service = new SQRService();
        int sqrCiselInterval = service.SqrCiselInterval(100, 200);
        int expected = 10;
        assertEquals(expected, sqrCiselInterval);
    }

    @Test
    void sholdSqrCiselInterval2() {
        SQRService service = new SQRService();
        int sqrCiselInterval = service.SqrCiselInterval(150, 350);
        int expected = 6;
        assertEquals(expected, sqrCiselInterval);
    }

}
