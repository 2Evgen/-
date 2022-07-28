package ru.netology.javaqa.Java.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrService service = new SqrService();

        int expected = 16;
        int actual = service.sqrOfNumber(service.max, service.min);

        Assertions.assertEquals(expected, actual);

    }

    //  @Test
    //  public void shouldCalcInExact() {
    //      SqrService service = new SqrService();

    //     int expected = 15;
    //     int actual = service.sqrOfNumber(service.min);

    //     Assertions.assertEquals(expected, actual);

}






