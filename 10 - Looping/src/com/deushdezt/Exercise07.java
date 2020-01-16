package com.deushdezt;

public class Exercise07 {
    public static void main(String[] args) {
        int minNum = 0,
                maxNum = 10;

        int random = -1;
        int attempt = 0;

        while (random != 7) {
            random = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            System.out.println("Attempt " + attempt + "= " + random);
            attempt++;
        }
    }
}
