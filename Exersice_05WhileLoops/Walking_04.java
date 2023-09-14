package Exersice_05WhileLoops;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;
        boolean isGoingHome = false;

        while(totalSteps < 10000){
            String command = scanner.nextLine();

            if (command.equals("Going home")){
                isGoingHome = true;
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + steps;
                break;
            }else{
                int steps = Integer.parseInt(command);
                totalSteps = totalSteps + steps;
            }
        }

        int diff = Math.abs(10000 - totalSteps);

        if (isGoingHome && totalSteps < 10000){
            System.out.printf("%d more steps to reach goal.", diff);
        }else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",diff);
        }
    }
}
