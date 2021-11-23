package ru.netology.sqr;

public class SQRService {
    int calc(int firstNum, int secondNum) {
       int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstNum && i * i <= secondNum) {
                count++;
            }
            }

System.out.println(count);
        return count;
        }


    }