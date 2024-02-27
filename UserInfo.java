import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Ask for the user's favorite color
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        // Close the Scanner
        scanner.close();

        // Format the message using String.format()
        String message = String.format("Hello, %s! You are %d years old and your favorite color is %s.", name, age, favoriteColor);

        // Print out the formatted message
        System.out.println(message);
    }
}
