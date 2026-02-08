package Swap_package;

public class swap_operation {

    // User Defined Function (UDF) to swap two numbers
    public void swap(int x, int y) {
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
