import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(inputDay);

            switch (day) {
                case MONDAY:
                    System.out.println("Start of the work week.");
                    break;
                case FRIDAY:
                    System.out.println("End of the work week.");
                    break;
                case SUNDAY:
                    System.out.println("Time to relax!");
                    break;
                default:
                    System.out.println("Just another day.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered!");
        }
    }
}
