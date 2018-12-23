package exercise;

import java.util.Random;
import java.util.Scanner;

public class HeadsTails {
    public static void headsTails() {
        Random random = new Random();
        Scanner input1 = new Scanner(System.in);

        System.out.println("Choose one option:\n1 - heads\n2 - tails");
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
    }
}
