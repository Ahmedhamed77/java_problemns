package loops;

import java.util.Scanner;

public class loops_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        int sum = 0;

        number = Math.abs(number);

        while (number > 0) {

            // get the last digit
            int digit = number % 10;

            sum += digit;

            // remove the last digit
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);

        scanner.close();

    }

}
