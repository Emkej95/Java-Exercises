package exercise;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    private Random random = new Random();

    public void runExercise() {
        Scanner input1 = new Scanner(System.in);
        int firstNumber = getNumber();
        int secondNumber = getNumber();

        System.out.println("\nWelcome to Higher/Lower game.\nFirst number is " + firstNumber + ". Guess whether next number will be higher or lower?");
        String guess = input1.nextLine();

        if (guess.equalsIgnoreCase("higher") && firstNumber < secondNumber) {
            System.out.println("Correct! :) New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("lower") && firstNumber > secondNumber) {
            System.out.println("Correct! :) New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("lower") && firstNumber < secondNumber) {
            System.out.println("Wrong! :( New number is " + secondNumber + ".");
        } else if (guess.equalsIgnoreCase("higher") && firstNumber > secondNumber) {
            System.out.println("Wrong! :( New number is " + secondNumber + ".");
        } else {
            System.out.println("You have to enter \"higher\" or \"lower\".");
        }
    }

    private int getNumber() {
        return random.nextInt(10) + 1;
    }
}
