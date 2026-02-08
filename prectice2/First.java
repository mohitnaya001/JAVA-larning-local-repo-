public class First {

    public static void main(String[] args) {

        // create autoboxing process

        // create primitive types
        int a = 5;
        double b = 5.65;

        // converts into wrapper objects
        Integer obj = new Integer(50);

        Integer a1 = Integer.valueOf(a);
        Double b1 = Double.valueOf(b);

        System.out.println(a1.TYPE);
        System.out.println(a1.SIZE);

        if (a1 instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if (b1 instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }
}
