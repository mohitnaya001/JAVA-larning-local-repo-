package EvenOdd;

public class EvenOddCheck {

    // User Defined Function (UDF) to check even or odd
    public void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
