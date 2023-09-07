 
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user to enter the amount to be converted
        System.out.print("Enter the amount to be converted: ");
        double amount = scanner.nextDouble();

        // Step 2: Read and store the amount entered by the user

        // Step 3: Prompt the user to enter the source currency
        System.out.print("Enter the source currency: ");
        String sourceCurrency = scanner.next();

        // Step 4: Read and store the source currency entered by the user

        // Step 5: Prompt the user to enter the target currency
        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.next();

        // Step 6: Read and store the target currency entered by the user

        // In a real-world scenario, you would fetch exchange rates from an API or use a predefined formula
        // For simplicity, let's assume a fixed conversion rate
        double exchangeRate = 1.2; // Example: 1 USD to EUR

        // Step 8: Multiply the amount by the exchange rate to perform the currency conversion
        double convertedAmount = amount * exchangeRate;

        // Step 9: Display the converted amount to the user
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        // Close the scanner
        scanner.close();
    }
}
