import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Sistem Diskon Belanja Online\n");

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Initialization
        String name;
        double totalPurchase;
        String membership;
        double discountPercent = 0.0;
        double discountAmount;
        double totalPayment;

        // Input
        System.out.print("Buyer name = ");
        name = inputScanner.nextLine();
        try{
            System.out.print("Total Purchase = Rp ");
            totalPurchase = inputScanner.nextDouble();
            inputScanner.nextLine();
            if(totalPurchase <=0){
                System.out.println("Error: Please input a valid number!");
                inputScanner.close();
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please input a valid data type!");
            inputScanner.close();
            return;
        }
        System.out.print("Membership (regular/premium/non-member) = ");
        membership = inputScanner.nextLine().toLowerCase();
        switch(membership){

            case "regular":
                if (totalPurchase >= 500000) {
                    discountPercent = 0.10;
                } else if (totalPurchase >= 100000) {
                    discountPercent = 0.05;
                }
                break;

            case "premium":
                if (totalPurchase >= 500000) {
                    discountPercent = 0.20;
                } else if (totalPurchase >= 300000) {
                    discountPercent = 0.15;
                } else if (totalPurchase >= 100000) {
                    discountPercent = 0.10;
                }
                break;

            case "non-member":
                discountPercent = 0.0;
                break;

            default:
                System.out.println("Error: Invalid membership type!");
                inputScanner.close();
                return;
        }

        // Logic
        discountAmount = totalPurchase * discountPercent;
        totalPayment = totalPurchase - discountAmount;

        // Print
        System.out.println("\nReport");
        System.out.println("Buyer Name = " + name);
        System.out.printf("Total Purchase = Rp %,.2f\n", totalPurchase);
        System.out.printf("Discount Percentage = %d%%\n", (int)(discountPercent * 100));
        System.out.printf("Discount Amount = Rp %,.2f\n", discountAmount);
        System.out.printf("Total Payment = Rp %,.2f\n", totalPayment);
    }
}