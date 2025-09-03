import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Sistem Absensi Karyawan\n");

        // Open Scanner
        Scanner inputScanner = new Scanner(System.in);

        // Initialization
        String name;
        int arrivalTime = 0;
        double dailySalary = 0.0;

        // Input
        try {
            System.out.print("Employee name: ");
            name = inputScanner.nextLine();
            System.out.print("Arrival time (800 for 08:00): ");
            arrivalTime = inputScanner.nextInt();
            if(arrivalTime>=2400){
                System.out.println("Error: Invalid time format!");
                inputScanner.close();
                return;
            }
            System.out.print("Daily salary: ");
            dailySalary = inputScanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter the correct data type!");
            inputScanner.close();
            return;
        }

        // Logic
        String status;
        double deductionPercent = 0.0;
        if (arrivalTime <= 800) {
            status = "Tepat Waktu";
            deductionPercent = 0.0;
        } else if (arrivalTime >= 801 && arrivalTime <= 815) {
            status = "Terlambat Ringan";
            deductionPercent = 0.01;
        } else if (arrivalTime >= 816 && arrivalTime <= 830) {
            status = "Terlambat Sedang";
            deductionPercent = 0.03;
        } else {
            status = "Terlambat Berat";
            deductionPercent = 0.05;
        }
        double deduction = dailySalary * deductionPercent;
        double receivedSalary = dailySalary - deduction;

        // Print
        System.out.println("\nAttendance Report");
        System.out.println("Employee: " + name);
        System.out.println("Status: " + status);
        System.out.println("Deduction: Rp " + deduction);
        System.out.println("Salary received: Rp " + receivedSalary);

        // Close scanner
        inputScanner.close();
    }
}