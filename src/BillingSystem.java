import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = inputScanner.nextInt();
        inputScanner.nextLine();

        double totalCost = 0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter item name for item " + i + ": ");
            String itemName = inputScanner.nextLine();
            System.out.print("Enter quantity for " + itemName + ": ");
            int itemQuantity = inputScanner.nextInt();
            System.out.print("Enter price per item for " + itemName + ": ");
            double itemPrice = inputScanner.nextDouble();

            double itemTotalCost = itemQuantity * itemPrice;
            totalCost += itemTotalCost;

            inputScanner.nextLine();
        }

        double vat = totalCost * 0.13;
        double discount = totalCost * 0.10;
        double finalTotalCost = totalCost + vat - discount;

        System.out.println("-------- Bill --------");
        System.out.println("Total Cost: NRP" + totalCost);
        System.out.println("VAT (13%): NRP" + vat);
        System.out.println("Discount (10%): NRP" + discount);
        System.out.println("Final Total Cost: NRP" + finalTotalCost);

        inputScanner.close();
    }
}

