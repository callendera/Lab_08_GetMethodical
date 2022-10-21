import java.util.Scanner;

public class CheckOut{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean keep_shopping = SafeInput.getYNConfirm(in, "Wanna shop? (y/n)");
        double itemTotal = 0;

        while (keep_shopping) {
            double price = SafeInput.getRangedDouble(in, "Enter price: ", 0.50, 9.99);
            itemTotal += price;
            keep_shopping = SafeInput.getYNConfirm(in, "Keep shopping? (y/n)");
        }
        System.out.printf("Total cost : $%.2f", itemTotal);

    }
}
