package ru.netology.sqr;

public class SQRService {
    public int rangeSquares(int leftBorder, int rightBorder) {
        int count = 0;
        for (int i = 10; i <= 90; i++) {
            if (leftBorder <= i * i && rightBorder >= i * i) {
                count++;
            }
        }
        return count;
    }
}
