import java.util.Scanner;

public class FavoriteNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int favourite_int = SafeInput.getInt(in, "Enter your favorite Number");
        double favourite_Double = SafeInput.getDouble(in, "Enter your favorite Decimal Number");
        System.out.println("Your favorite number is: " + favourite_int);
        System.out.println("Your favorite decimal number is: " + favourite_Double);

    }

}
