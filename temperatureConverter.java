import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("===========================");

        while (true) {
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Quit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("\nEnter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (choice == 2) {
                System.out.print("\nEnter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice == 3) {
                System.out.println("\nThank you for using the Temperature Conversion Tool!");
                break;
            } else {
                System.out.println("\nInvalid choice! Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
