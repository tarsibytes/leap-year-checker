import java.util.Scanner;

public class UserInputHandler {
    public static int getValidYear() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Inform a year: ");

        while (!userInput.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number: ");
            userInput.next();
        }

        int year = userInput.nextInt();
        userInput.close();

        return year;
    }
}
