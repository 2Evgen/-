package ru.netology.javaqa.Java.services;

public class SqrService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int SqrOfNumber = i * i;
            if (SqrOfNumber >= min && SqrOfNumber <= max) {
                count++;
            }
        }

        return count;
    }
}
