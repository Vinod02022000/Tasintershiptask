import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user to4 enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Step 2: Read and store the number entered by the user
        // (No need to do anything additional here since you've already stored it in firstNumber)

        // Step 3: Prompt the user to enter the second number
        System.out.print("Enter another number to multiply with the first number: ");
        double secondNumber = scanner.nextDouble();

        // Step 4: Read and store the second number entered by the user
        // (No need to do anything additional here since you've already stored it in secondNumber)

        // Step 5: Perform the multiplication of the two numbers
        double result = firstNumber * secondNumber;

        // Step 6: Display the result of the multiplication to the user
        System.out.println("Result of multiplication: " + result);

        // Close the scanner
        scanner.close();    }
}
