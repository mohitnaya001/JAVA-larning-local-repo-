class progrum{
    private static int x;
    void f1(){
        x = 5;
        System.out.println(x);
    }
}
class demo{
    public static void main(String[] args) {
        progrum d1 = new progrum();
        d1.f1();
    }
}