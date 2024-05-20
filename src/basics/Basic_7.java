package basics;

import java.util.Scanner;

public class Basic_7 {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the weight of the watermelon ");


        int weight = scanner.nextInt();

        if(weight > 2 && weight % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
    
}
