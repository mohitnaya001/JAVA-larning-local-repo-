public class Enum_methods {

    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    public static void main(String[] args) {

        // Using values() method it return all values mention in given enum areas
        for (Direction dir : Direction.values()) {
            System.out.println(dir);
        }

        // Using valueOf() method, it will display specified values in string format
        Direction dir_value = Direction.valueOf("EAST");
        System.out.println("Direction: " + dir_value);

        // Using ordinal() method,it will identify the position of specific values
        System.out.println("Ordinal of EAST: " + dir_value.ordinal());
    }
}
