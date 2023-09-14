package Exersice_04ForLoops;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= n; i++) {
            int groups = Integer.parseInt(scanner.nextLine());

            if (groups <= 5) {
                musala = musala + groups;
            } else if (groups <= 12) {
                monblan = monblan + groups;
            } else if (groups <= 25) {
                kilimandjaro = kilimandjaro + groups;
            } else if (groups <= 40) {
                k2 = k2 + groups;
            } else {
                everest = everest + groups;
            }

            sum = sum + groups;
        }
        System.out.printf("%.2f%%\n", musala * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n", monblan * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n", kilimandjaro * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n", k2 * 1.0 / sum * 100);
        System.out.printf("%.2f%%\n", everest * 1.0 / sum * 100);
    }
}
