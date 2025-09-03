import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Open scanner
        Scanner inputScanner = new Scanner(System.in);

        // Input
        System.out.print("Input Username: ");
        String name = inputScanner.nextLine();
        int score = 0;
        try {
            System.out.print("Input Score: ");
            score = inputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Score must be number!");
            inputScanner.close();
            return;
        }
        // Logic
        String grade = "";
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
        System.out.println(name + " with a score of " + score + " received grade " + grade);

        // Close scanner
        inputScanner.close();
    }
}