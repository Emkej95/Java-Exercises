package exercise;

import java.util.Scanner;

public class FizzBuzz {
    private Scanner input1 = new Scanner(System.in);

    public void runExercise() {
        System.out.println("\nWelcome to FizzBuzz!\nPlease enter number between 1-100");
        int userInput = Integer.parseInt(input1.nextLine());

        if (checkIfDivisibleByThree(userInput) && !checkIfDivisibleByFive(userInput)) {
            System.out.println("Fizz!");
            askNewGame();
        } else if (checkIfDivisibleByFive(userInput) && !checkIfDivisibleByThree(userInput)) {
            System.out.println("Buzz!");
            askNewGame();
        } else if (checkIfDivisibleByThree(userInput) && checkIfDivisibleByFive(userInput)) {
            System.out.println("FizzBuzz!!!");
            askNewGame();
        } else {
            System.out.println("No Fizz and no Buzz :(");
            askNewGame();
        }
    }

    private boolean checkIfDivisibleByThree(int userNumber) {
        return userNumber % 3 == 0;
    }

    private boolean checkIfDivisibleByFive(int userNumber) {
        return userNumber % 5 == 0;
    }

    private void askNewGame() {
        Scanner another = new Scanner(System.in);
        System.out.println("Do you want to play again? Y/N");
        String newGame = another.nextLine();
        if (newGame.equalsIgnoreCase("y")) {
            runExercise();
        }
    }
}
