package Exersice_05WhileLoops;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int hеight = Integer.parseInt(scanner.nextLine());

        int space = length * width * hеight;
        int totalBox = 0;
        boolean spaceIsNotEnough = false;

        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int cartons = Integer.parseInt(command);
            totalBox = totalBox + cartons;

            if (totalBox > space){
                spaceIsNotEnough = true;
                break;
            }

            command = scanner.nextLine();
        }

        double diff = Math.abs(space - totalBox);

        if(spaceIsNotEnough){
            System.out.printf("No more free space! You need %.0f Cubic meters more.",diff);
        }else {
            System.out.printf("%.0f Cubic meters left.",diff);
        }
    }
}
