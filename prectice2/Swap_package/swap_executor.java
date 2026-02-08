package Swap_package;

public class swap_executor {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Creating object of SwapOperation class
        swap_operation obj = new swap_operation();

        // Executing UDF
        obj.swap(a, b);
    }
}
