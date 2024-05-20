package basics;

import java.util.Scanner;

public class Basic_4 {
    
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number .....");
        Double first_num = scanner.nextDouble();
        
        System.out.println("Enter Second number .....");
        Double second_num = scanner.nextDouble();

        System.out.print("Enter the operation method (+, -, *, /): ");
        char operation = scanner.next().charAt(0);


        Double operationResult = 0.0;

        switch (operation) {
            case '+':
                operationResult = first_num + second_num;
                break;
            case '-':
                operationResult = first_num - second_num;
                break;
            case '*':
                operationResult = first_num * second_num;
                break;
            case '/':
                operationResult = first_num / second_num;
                break;
        
            default:
                System.out.println("Unknown operation.");
                operationResult = 0.0;
                break;
        }


        System.out.println("The result of the operation is: " + operationResult);
        

        scanner.close();
    }
}
