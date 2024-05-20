package loops;

import java.util.Scanner;

// take number from the user Write a java program to print its factorial.
public class loops_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 2; i <= number; i++) {

            factorial = factorial * i;

        }

        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();

    }
}
