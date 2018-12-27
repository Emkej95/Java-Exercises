import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final UI ui = new UI();
        final Scanner input1 = new Scanner(System.in);
        String exerciseNumber;

        do {
            System.out.println("\nEnter number which exercise you want to check:");
            exerciseNumber = input1.nextLine();

            if (!exerciseNumber.equalsIgnoreCase("exit")) {
                ui.runExercise(exerciseNumber);
            } else if (exerciseNumber.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
            }
        } while (!exerciseNumber.equalsIgnoreCase("exit"));
    }
}