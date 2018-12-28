package exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Scanner input1 = new Scanner(System.in);
    private String birthDate;


    public void runExercise() {
        System.out.println("\nWelcome to age calculator.\nPlease enter your birth date (ie. 01/01/1999):");

        try {
            birthDate = input1.nextLine();
        } catch (DateTimeParseException e) {
            System.out.println("Wrong date input!");
            return;
        }

        System.out.println("You are " + calculateAge().getYears() + " years " + calculateAge().getMonths() + " months and " + calculateAge().getDays() + " days old.");
    }

    private Period calculateAge() {
        return Period.between(LocalDate.parse(birthDate, dtf), LocalDate.now());
    }

}
