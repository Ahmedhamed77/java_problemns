package basics;

import java.util.Scanner;

public class Basic_5 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number .....");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input, please enter a number");
            scanner.next();
            scanner.nextLine();   
        }


        double number = scanner.nextDouble();



        if(number > 0) {
            System.out.println("The number is positive");
        } else if(number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        scanner.close();
    }
}
