package basics;

import java.util.Scanner;

public class Basic_6 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Grade (A, B or C ) .....");

        String grade = scanner.next().toUpperCase();

        switch (grade) {
            case "A":
                System.out.println("Marks: >= 80");
                break;
            case "B":
                System.out.println("Marks: >= 60 and < 80");
                break;
            case "C":
                System.out.println("Marks: >= 40 and < 60");
                break;

            default:
                System.out.println("Invalid grade entered. Please enter A, B, or C.");
                break;
        }

        scanner.close();

    }
}
