package loops;

import java.util.Scanner;

public class loops_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ....");

        int number = scanner.nextInt();

        int count = 0;

        if (number == 0) {
            count += 1;
        }else {
            while (number > 0) {
                // remove last digit
                number /= 10;
                count++;
            }
        }


        System.out.println("The number of digits is: " + count);

        scanner.close();

    }
}
