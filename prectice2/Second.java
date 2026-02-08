public class Second {

    public static void main(String[] args) {

        // Float f1 = new Float();

        String s = "3.14f";
        System.out.println(s);

        Float f1 = Float.valueOf(s);
        System.out.println("float=" + f1);

        Integer i = Integer.valueOf("101011", 2);
        System.out.println(i);

        // parseXXX()
        int i1 = Integer.parseInt("12345");
        System.out.println(i1);

        float f = Float.parseFloat("3.14f");
        System.out.println(f);

        // xxxValue()
        Float f2 = Float.parseFloat("3.14f");
        float fvalue = f2.floatValue();
        System.out.println("xvalue()" + fvalue);
    }
}
