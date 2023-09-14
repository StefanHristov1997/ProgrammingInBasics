package Exersice_05WhileLoops;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());

        int cake = lenght * weight;
        boolean isCakeEnough = false;
        String command = scanner.nextLine();


        while (!command.equals("STOP")) {
            int peaces = Integer.parseInt(command);
            cake = cake - peaces;

            if (cake <= 0) {
                isCakeEnough = true;
                break;
            }
            command = scanner.nextLine();
        }


        if (isCakeEnough) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(cake));
        }
    }
}
