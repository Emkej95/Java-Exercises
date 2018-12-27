package exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    private Random random = new Random();

    public void runExercise() {
        Scanner input1 = new Scanner(System.in);

        System.out.println("\nWelcome to Heads/Tails game.\nYou have to guess the result of coin flip.\nChoose one option:\n1 - heads\n2 - tails");

        try {
            int guess = input1.nextInt();

            if (getNumber() == 1 && guess == 1) {
                System.out.println("Correct! :) It's heads!");
            } else if (getNumber() == 2 && guess == 2) {
                System.out.println("Correct! :) It's tails!");
            } else if (getNumber() == 1 && guess == 2) {
                System.out.println("Wrong! :( It's heads!");
            } else if (getNumber() == 2 && guess == 1) {
                System.out.println("Wrong! :( It's tails!");
            } else {
                System.out.println("You have to enter \"heads\" or \"tails\".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
    }

    private int getNumber() {
        return random.nextInt(2) + 1;
    }
}
