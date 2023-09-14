package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episod = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double lunchTime = rest / 8.0;
        double rest2 = rest / 4.0;
        double result = (rest - (lunchTime + rest2));
        double timeLeft = Math.abs(result - episod);

        if (result >= episod) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(timeLeft));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName,Math.ceil(timeLeft));
        }
    }
}
