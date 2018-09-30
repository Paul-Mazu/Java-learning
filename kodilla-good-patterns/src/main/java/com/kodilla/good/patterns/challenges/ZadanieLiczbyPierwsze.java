package com.kodilla.good.patterns.challenges;

public class ZadanieLiczbyPierwsze {

    public static boolean metod(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int pierwsze = 0;
        int temp = 2;

        while (pierwsze < 10000) {
            if (metod(temp)) {
                pierwsze++;
                System.out.println(temp);
            }
            temp++;
        }
        System.out.println(temp - 1);

    }
}
