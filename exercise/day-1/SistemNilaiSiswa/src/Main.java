import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Title
        System.out.println("Sistem Nilai Siswa");

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Initialization
        String name;
        int score;
        String grade;

        // Input
        System.out.print("Input Username: ");
        name = inputScanner.nextLine();
        try {
            System.out.print("Input Score: ");
            score = inputScanner.nextInt();
            inputScanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please input a valid data type");
            inputScanner.close();
            return;
        }

        // Logic
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score < 60) {
            grade = "E";
        } else {
            grade = "Invalid score";
        }

        // Print
        System.out.println(name + " with a score of " + score + " received grade " + grade);

        // Close scanner
        inputScanner.close();
    }
}