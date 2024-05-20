package loops;

import java.util.Scanner;

public class loops_12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number .....");

        int num = scanner.nextInt();

        int count = 0;


        while (num >= 1) {
            // System.out.println("num"+num);
            num /= 2;
            count++;
        }


        System.out.println("The number can be divided by 2," + count + " times before it becomes less than 1.");


        scanner.close();
    }
}
