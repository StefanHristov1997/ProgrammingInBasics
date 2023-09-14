package Exersice_05WhileLoops;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double sumInCoins = Math.round(price * 100);
        int coinCounter = 0;

        while (sumInCoins > 0) {
            if (sumInCoins >= 200) {
                coinCounter++;
                sumInCoins = sumInCoins - 200;
            } else if (sumInCoins >= 100) {
                coinCounter++;
                sumInCoins = sumInCoins - 100;
            } else if (sumInCoins >= 50) {
                coinCounter++;
                sumInCoins = sumInCoins - 50;
            } else if (sumInCoins >= 20) {
                coinCounter++;
                sumInCoins = sumInCoins - 20;
            } else if (sumInCoins >= 10) {
                coinCounter++;
                sumInCoins = sumInCoins - 10;
            } else if (sumInCoins >= 5) {
                coinCounter++;
                sumInCoins = sumInCoins - 5;
            } else if (sumInCoins >= 2) {
                coinCounter++;
                sumInCoins = sumInCoins - 2;
            } else if (sumInCoins >= 1) {
                coinCounter++;
                sumInCoins = sumInCoins - 1;
            } else {
                break;
            }
        }
        System.out.println(coinCounter);
    }
}
