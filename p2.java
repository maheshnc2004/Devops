import java.util.Scanner;  // Import Scanner class to read user input

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        int sum = num1 + num2;  // Calculate the sum
        System.out.println("The sum is: " + sum);  // Print the sum
    }
}
