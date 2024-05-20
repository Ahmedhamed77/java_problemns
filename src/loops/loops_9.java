package loops;

import java.util.Scanner;

public class loops_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter a positive number: (or a negative number to stop) ");

            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }
            count++;
            sum += num;
        }

        if(count > 0) {
            double average = (double) sum / count;
            System.out.println("The average of the entered numbers is: " + average);
        }
        else {
            System.out.println("No numbers were entered.");
        }
        scanner.close();
    }

}
