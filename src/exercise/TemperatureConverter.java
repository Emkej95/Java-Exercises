package exercise;

import java.util.Scanner;

public class TemperatureConverter {

    public void getUnits() {
        try {
            System.out.println("Welcome to temperature converter.\nPlease enter in a specified order: value, unit and destiny unit");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            String[] unitList = userInput.toLowerCase().split("[-, ]");
            convertUnits(unitList[1], unitList[2], Integer.parseInt(unitList[0]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong input!");
        }
    }

    private void convertUnits(String currentUnit, String destinyUnit, int currentValue) {

        if (currentUnit.equalsIgnoreCase("celsius") && destinyUnit.equalsIgnoreCase("fahrenheit")) {
            celsiusToFahrenheit(currentValue);
        } else if (currentUnit.equalsIgnoreCase("celsius") && destinyUnit.equalsIgnoreCase("kelvin")) {
            celsiusToKelvin(currentValue);
        } else if (currentUnit.equalsIgnoreCase("fahrenheit") && destinyUnit.equalsIgnoreCase("celsius")) {
            fahrenheitToCelsius(currentValue);
        } else if (currentUnit.equalsIgnoreCase("fahrenheit") && destinyUnit.equalsIgnoreCase("kelvin")) {
            fahrenheitToKelvin(currentValue);
        } else if (currentUnit.equalsIgnoreCase("kelvin") && destinyUnit.equalsIgnoreCase("celsius")) {
            kelvinToCelsius(currentValue);
        } else if (currentUnit.equalsIgnoreCase("kelvin") && destinyUnit.equalsIgnoreCase("fahrenheit")) {
            kelvinToFahrenheit(currentValue);
        } else {
            System.out.println("Wrong temperature units!");
        }
    }

    private void celsiusToFahrenheit(int currentValue) {
        System.out.println(currentValue + " Celsius degrees equals " + String.valueOf(currentValue * 9 / 5 + 32) + " Fahrenheits.");
        anotherConversion();
    }

    private void celsiusToKelvin(int currentValue) {
        System.out.println(currentValue + " Celsius degrees equals " + String.valueOf(currentValue + 273.15) + " Kelvins.");
        anotherConversion();
    }

    private void fahrenheitToKelvin(int currentValue) {
        System.out.println(currentValue + " Fahrenheit degrees equals " + String.valueOf((currentValue + 459.67) * 5 / 9) + " Kelvins.");
        anotherConversion();
    }

    private void fahrenheitToCelsius(int currentValue) {
        System.out.println(currentValue + " Fahrenheit degrees equals " + String.valueOf((currentValue - 32) * 5 / 9) + " Celsius.");
        anotherConversion();
    }

    private void kelvinToFahrenheit(int currentValue) {
        System.out.println(currentValue + " Kelvin degrees equals " + String.valueOf(currentValue * 9 / 5 - 459.67) + " Fahrenheits.");
        anotherConversion();
    }

    private void kelvinToCelsius(int currentValue) {
        System.out.println(currentValue + " Kelvin degrees equals " + String.valueOf(currentValue - 273.15) + " Celsius.");
        anotherConversion();
    }

    private void anotherConversion() {
        Scanner another = new Scanner(System.in);
        System.out.println("Do you want to make another conversion? Y/N");
        String newConversion = another.nextLine();
        if (newConversion.equalsIgnoreCase("y")) {
            getUnits();
        }
    }
}