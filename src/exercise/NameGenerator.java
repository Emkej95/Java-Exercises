package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameGenerator {

    private final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
    private final List<String> lettersList = Arrays.asList(letters);
    private final Random random = new Random();
    private int nameLength = random.nextInt(10) + 3;

    public void runExercise() {
        System.out.print("\nWelcome to name generator.\nRandomly generated name is: " + getName() + "\n");
    }

    private String getName() {
        String name = "";
        int i = 0;

        do {
            name = new StringBuilder(name).append(lettersList.get(random.nextInt(lettersList.size()))).toString();
            i++;
        } while (i<nameLength);

        return name;
    }
}
