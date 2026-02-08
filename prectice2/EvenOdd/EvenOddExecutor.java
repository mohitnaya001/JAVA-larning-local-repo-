package EvenOdd;

import java.util.Scanner;

public class EvenOddExecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Creating object of EvenOddCheck class
        EvenOddCheck obj = new EvenOddCheck();

        // Calling UDF
        obj.checkNumber(number);

        sc.close();
    }
}
