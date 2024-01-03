import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        double subjectMarks, totalMarks = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of subjects");
        double numberOfSubjects = scanner.nextInt();

        for (double i = 1; i <= numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + i);
            subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        double percentage = ((totalMarks / (numberOfSubjects * 100)) * 100);
        System.out.println("The percentage is: " + percentage);

        if (percentage <= 100 && percentage > 90) {
            System.out.println("Your grade is distinction");
        } else if (percentage <= 90 && percentage > 80) {
            System.out.println("Your grade is first division");
        } else {
            System.out.println("You have failed.");
        }
    }
}
