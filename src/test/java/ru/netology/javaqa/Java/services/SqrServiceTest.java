package ru.netology.javaqa.Java.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {

    @Test
    public void test() {
        SqrService service = new SqrService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        SqrService service = new SqrService();

        int actual = service.calculate(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test3() {
        SqrService service = new SqrService();

        int actual = service.calculate(300, 600);
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }
}






