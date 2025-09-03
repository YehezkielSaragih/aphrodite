import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Kalkulator Tarif Parkir\n");

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Vehicle type
        System.out.print("Vehicle type (motor/mobil) = ");
        String vehicleType = inputScanner.nextLine().toLowerCase();
        if (!vehicleType.equals("motor") && !vehicleType.equals("mobil")) {
            System.out.println("Invalid vehicle type!");
            inputScanner.close();
            return;
        }

        // Park duration
        int parkDuration=0;
        try {
            System.out.print("Parking duration (hours): ");
            parkDuration = inputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Parking duration must be a number!");
            inputScanner.close();
            return;
        }

        // Total fee
        int totalFee = 0;
        switch(vehicleType){

            case "motor":
                if (parkDuration <= 2) {
                    totalFee = 2000;
                } else {
                    totalFee = 2000 + (parkDuration - 2) * 1000;
                }
                if (totalFee > 10000) {
                    totalFee = 10000;
                }
                break;

            case "mobil":
                if (parkDuration <= 2) {
                    totalFee = 5000;
                } else {
                    totalFee = 5000 + (parkDuration - 2) * 2000;
                }
                if (totalFee > 25000) {
                    totalFee = 25000;
                }
                break;
            default:
                System.out.println("Invalid vehicle type!");
                inputScanner.close();
                return;
        }
        System.out.println("Total fee = Rp "+totalFee);

        // Close scanner
        inputScanner.close();
    }
}