import exercise.NameGenerator;
import exercise.HigherLower;
import exercise.HeadsTails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input1 = new Scanner(System.in);
        String exerciseNumber;

        do {
            System.out.println("\nEnter number which exercise you want to check:");
            exerciseNumber = input1.nextLine();

            if (!exerciseNumber.equalsIgnoreCase("exit")) {
                System.out.println("Running exercise " + exerciseNumber);
                runExercise(exerciseNumber);
            } else if (exerciseNumber.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
            }
        } while (!exerciseNumber.equalsIgnoreCase("exit"));
    }

    private static void runExercise(String exerciseNumber) {
        if (exerciseNumber.equals("1")) {
            NameGenerator.nameGenerator();
        } else if (exerciseNumber.equals("2")) {
            HigherLower.higherLower();
        } else if (exerciseNumber.equals("3")) {
            HeadsTails.headsTails();
        }
    }
}