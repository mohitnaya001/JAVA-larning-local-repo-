enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Main {
    public static void main(String[] args) {

        // Accessing enum values
        DaysOfWeek today = DaysOfWeek.MONDAY;

        System.out.println("Today is: " + today);

        // Loop through all enum values
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
    }
}
