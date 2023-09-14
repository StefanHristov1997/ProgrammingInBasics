package Exercise_02ConditionalStatments;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = (hours * 60) + minutes + 15;

        hours = totalMin / 60;
        minutes = totalMin % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}



