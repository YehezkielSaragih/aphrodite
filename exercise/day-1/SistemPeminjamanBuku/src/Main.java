import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Sistem Peminjaman Buku Perpustakaan\n");

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Initialization
        String memberName;
        String memberType;
        int daysElapsed;
        int daysLimit;
        String loanStatus;
        double finePerDay;
        double totalFine;

        // Input
        System.out.print("Member Name = ");
        memberName=inputScanner.nextLine();
        System.out.print("Member Type = ");
        memberType=inputScanner.nextLine().toLowerCase();
        switch(memberType) {
            case "mahasiswa":
                daysLimit = 14;
                finePerDay = 1000;
                break;

            case "dosen":
                daysLimit = 30;
                finePerDay = 2000;
                break;

            case "umum":
                daysLimit = 7;
                finePerDay = 500;
                break;

            default:
                System.out.println("Error: Invalid membership type!");
                inputScanner.close();
                return;
        }
        System.out.print("Days Elapsed = ");
        daysElapsed = inputScanner.nextInt();
        inputScanner.nextLine();

        // Logic
        if (daysElapsed <= daysLimit) {
            loanStatus = "tepat waktu";
            totalFine = 0;
        } else if (daysElapsed <= daysLimit + 7) {
            loanStatus = "terlambat";
            totalFine = (daysElapsed - daysLimit) * finePerDay;
        } else {
            loanStatus = "suspensi";
            totalFine = (daysElapsed - daysLimit) * finePerDay;
        }

        // Print
        System.out.println("\nReport");
        System.out.println("Member Name = " + memberName);
        System.out.println("Loan Status = " + loanStatus);
        System.out.println("Days Elapsed = " + daysElapsed);
        System.out.printf("Total Fine = Rp %,.2f\n", totalFine);

        // Close scanner
        inputScanner.close();
    }
}