package ru.netology.sqr;

public class SQRService {

    public int SqrCiselInterval(int startInterval, int ending) {
        int amountSqr = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= startInterval && i * i <= ending) {
                amountSqr++;
            }
        return amountSqr;
    }
}
