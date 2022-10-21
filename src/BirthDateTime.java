import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year you were born: ", 1950, 2010);
        System.out.println("Your Birth year is: " + year);
        int month = SafeInput.getRangedInt(in, "Enter the month you were born: ", 1, 12);
        System.out.println("Your Birth month is: " + month);

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 31);
            case 2 -> SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 29);
            default -> SafeInput.getRangedInt(in, "Enter the day you were born: ", 1, 30);
        };
        System.out.println("The day you were born is: " + day);

        int hour = SafeInput.getRangedInt(in, "Enter the hour you were born: ", 1, 24);
        System.out.println("Your Birth hour is: " + hour + ":00");
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were born: ", 1, 59);
        System.out.println("Your Birth minute is: 0:" + minute);
        System.out.println("Your BirthDate and Time is: " + day + "/" + month + "/" + year + " at " + hour + ":" + minute);
    }

}
