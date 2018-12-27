package exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    public void runExercise() {
        Random random = new Random();
        Scanner input1 = new Scanner(System.in);

        System.out.println("Welcome to Heads/Tails game.\nYou have to guess the result of coin flip.\nChoose one option:\n1 - heads\n2 - tails");
        try {
            int guess = input1.nextInt();

            int result = random.nextInt(2) + 1;

            if (result == 1 && guess == 1) {
                System.out.println("Correct! :) It's heads!");
            } else if (result == 2 && guess == 2) {
                System.out.println("Correct! :) It's tails!");
            } else if (result == 1 && guess == 2) {
                System.out.println("Wrong! :( It's heads!");
            } else if (result == 2 && guess == 1) {
                System.out.println("Wrong! :( It's tails!");
            } else if (guess != 1 || guess != 2) {
                System.out.println("You have to enter \"heads\" or \"tails\".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
    }
}
