enum Shape {
    CIRCLE,
    SQUARE,
    RECTANGLE,
    TRIANGLE
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape shape = Shape.RECTANGLE;

        System.out.println("Selected shape: " + shape);

        for (Shape s : Shape.values()) {
            System.out.println(s);
        }
    }
}
