package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NameGenerator {
    public static void nameGenerator() {
        final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
        final List<String> lettersList = Arrays.asList(letters);
        final Random random = new Random();
        int nameLength = random.nextInt(10) + 3;

        System.out.print("Randomly generated name is: ");
        for (int i = 0; i < nameLength; i++) {
            String name = lettersList.get(random.nextInt(lettersList.size()));
            System.out.print(name);
        }
    }
}
