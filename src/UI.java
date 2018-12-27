import exercise.HeadsTails;
import exercise.HigherLower;
import exercise.NameGenerator;
import exercise.TemperatureConverter;

class UI {
    private HigherLower higherLower = new HigherLower();
    private HeadsTails headsTails = new HeadsTails();
    private NameGenerator nameGenerator = new NameGenerator();
    private TemperatureConverter temperatureConverter = new TemperatureConverter();

    void runExercise(String exerciseNumber) {
        if (exerciseNumber.equals("1")) {
            nameGenerator.runExercise();
        } else if (exerciseNumber.equals("2")) {
            higherLower.runExercise();
        } else if (exerciseNumber.equals("3")) {
            headsTails.runExercise();
        } else if (exerciseNumber.equalsIgnoreCase("4")) {
            temperatureConverter.getUnits();
        }
    }
}