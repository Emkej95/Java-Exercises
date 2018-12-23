package exercise;

import java.util.Random;
import java.util.Scanner;

public class Second {
    public static void higherLower() {
        Random random = new Random();
        Scanner input1 = new Scanner(System.in);
        int firstNumber = random.nextInt(10) + 1;
        int secondNumber = random.nextInt(10) + 1;

        System.out.println("First number is " + firstNumber + ". Guess whether next number will be higher or lower?");
        String guess = input1.nextLine();

        if (guess.equalsIgnoreCase("higher") && firstNumber < secondNumber) {
            System.out.println("Correct! :) New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("lower") && firstNumber > secondNumber) {
            System.out.println("Correct! :) New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("lower") && firstNumber < secondNumber) {
            System.out.println("Wrong! :( New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("higher") && firstNumber > secondNumber) {
            System.out.println("Wrong! :( New number is " + secondNumber + ".");
        } else if (!guess.equalsIgnoreCase("higher") || !guess.equalsIgnoreCase("lower")) {
            System.out.println("You have to enter \"higher\" or \"lower\".");
        }
    }
}
