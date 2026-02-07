public class my_oops1 {
    int x = 5;

    public static void main(String[] args) {
        int y = 4;
        System.out.println("y=" + y);

        my_oops1 m1 = new my_oops1();
        System.out.println("value of x by first object=" + m1.x);

        my_oops1 m2 = new my_oops1();
        m2.x = 25;
        System.out.println("value of x by second object=" + m2.x);
    }
}
