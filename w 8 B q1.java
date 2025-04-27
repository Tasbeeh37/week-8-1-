import java.util.Scanner;
import java.text.DecimalFormat;

public class BDToEuroConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.##"); // Format up to 2 decimal places

        System.out.println("BD to EUR converter");

        while (true) {
            System.out.println("Please enter amount (-99 to quit):");
            double amount = scan.nextDouble();

            if (amount == -99) {
                break;
            }

            double euros = convertToEuro(amount);
            System.out.println(fmt.format(amount) + "BD is equal to " + fmt.format(euros) + "Euros");
        }

        scan.close();
    }

    public static double convertToEuro(double bd) {
        double conversionRate = 1.85;
        return bd * conversionRate;
    }
}
