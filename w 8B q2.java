public static void convert() {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.##");
    double amount;

    System.out.println("BD to EUR converter");

    while (true) {
        System.out.println("Please enter amount (-99 to quit):");
        amount = scan.nextDouble();

        if (amount == -99) {
            break;
        }

        double euros = convert2euro(amount);
        System.out.println(fmt.format(amount) + "BD is equal to " + fmt.format(euros) + " Euros");
    }
}

public static double convert2euro(double bd) {
    double conversionRate = 1.85;
    return bd * conversionRate;
}
