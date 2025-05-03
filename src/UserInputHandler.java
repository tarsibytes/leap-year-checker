import java.util.Scanner;

public class UserInputHandler {
    public static int getValidYear() {
        Scanner userInput = new Scanner(System.in);
        int year;

        System.out.print("Inform a year (format xxxx): ");

        while (true) {
            // Check if input is an integer before reading it
            if (!userInput.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                userInput.next();
                continue;
            }

            year = userInput.nextInt();

            // Validate the year format (must be between 1000 and 9999)
            if (year < 1000 || year > 9999) {
                System.out.println("Invalid year format. Please enter a four-digit year (1000-9999):");
                continue;
            }

            break;
        }

        userInput.close();
        return year;
    }
}