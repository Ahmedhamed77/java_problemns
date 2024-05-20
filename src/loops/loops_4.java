package loops;

import java.util.Scanner;

// You take two number from the user , base and power The output: Base ^ power
public class loops_4 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base: ");

        double base = scanner.nextDouble();

        System.out.println("Enter the power: ");

        double power = scanner.nextDouble();

        double result = Math.pow(base, power);

        System.out.println(result);

        scanner.close();
    }
}
