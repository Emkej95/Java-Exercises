import exercise.*;

class UI {
    private HigherLower higherLower = new HigherLower();
    private HeadsTails headsTails = new HeadsTails();
    private NameGenerator nameGenerator = new NameGenerator();
    private TemperatureConverter temperatureConverter = new TemperatureConverter();
    private AgeCalculator ageCalculator = new AgeCalculator();
    private EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
    private FizzBuzz fizzBuzz = new FizzBuzz();

    void runExercise(String exerciseNumber) {
        if (exerciseNumber.equals("1")) {
            nameGenerator.runExercise();
        } else if (exerciseNumber.equals("2")) {
            higherLower.runExercise();
        } else if (exerciseNumber.equals("3")) {
            headsTails.runExercise();
        } else if (exerciseNumber.equals("4")) {
            temperatureConverter.runExercise();
        } else if (exerciseNumber.equals("5")) {
            ageCalculator.runExercise();
        } else if (exerciseNumber.equals("6")) {
            encryptDecrypt.runExercise();
        } else if (exerciseNumber.equals("7")) {
            fizzBuzz.runExercise();
        }
    }
}