package exercise;

import java.util.Random;
import java.util.Scanner;

public class LoveCalculator {
    public void runExercise() {
        Random random = new Random();
        Scanner input1 = new Scanner(System.in);

        System.out.println("\nWelcome to Love Calculator <3\nPlease enter your name: ");
        input1.nextLine();
        System.out.println("Enter your partners name:");
        input1.nextLine();
        System.out.println("Calculating how strong is your love:");

        try {
            for (int i = 0; i <= 6; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nYour love to each other is " + (random.nextInt(100) + 1) + "% strong!");
    }
}