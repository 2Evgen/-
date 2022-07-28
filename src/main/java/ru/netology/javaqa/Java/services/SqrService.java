package ru.netology.javaqa.Java.services;

public class SqrService {
    int min = 200;
    int max = 300;

    public int sqrOfNumber(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            int SqrOfNumber = i * i;
            if (SqrOfNumber >= min && SqrOfNumber <= max) {

            }
            return i;
        }

        return -1;
    }
}
