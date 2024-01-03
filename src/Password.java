import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        int remainingAttempts = 4;
        String correctUsername = "padhnaja", correctPassword = "chwache";
        Scanner scanner = new Scanner(System.in);

        while (remainingAttempts >= 0) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.next();
            System.out.print("Enter password: ");
            String enteredPassword = scanner.next();

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Logged in successfully.");
                break;
            } else {
                System.out.println("Incorrect username or password. Remaining attempts: " + remainingAttempts);
                remainingAttempts--;
            }
        }

        scanner.close();
    }
}
