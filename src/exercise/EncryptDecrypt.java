package exercise;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class EncryptDecrypt {

    private final String userHome = System.getProperty("user.home");
    private final String pathToFile = (userHome + "\\Downloads\\words.csv");
    private Scanner input1 = new Scanner(System.in);
    private String userHash, userWord;

    public void runExercise() {
        System.out.println("\nWelcome to encrypter/decrypter.\nWould you like to encrypt or decrypt a word?");
        String userMessage = input1.nextLine();

        if (userMessage.equalsIgnoreCase("encrypt")) {
            getUserWord();
            System.out.println("Your word has been correctly encrypted. Please save this hash so you can decrypt it later: \n" + getEncryptedMessage(userWord));
            saveToCsv(userWord, getEncryptedMessage(userWord));
            askNewMessage();
        } else if (userMessage.equalsIgnoreCase("decrypt")) {
            getUserHash();
            getDecryptedMessage(userHash);
            askNewMessage();
        } else {
            System.out.println("You can only encrypt or decrypt a word. Please enter \"encrypt\" or \"decrypt\".");
        }
    }

    private void getUserWord() {
        Scanner word = new Scanner(System.in);
        System.out.println("Please enter word: ");
        userWord = word.nextLine();
    }

    private void getUserHash() {
        Scanner hash = new Scanner(System.in);
        System.out.println("Please enter hash: ");
        userHash = hash.nextLine();
    }

    private String getEncryptedMessage(String word) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(word.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No such algorithm!");
            return null;
        }
    }

    private void saveToCsv(String word, String hash) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean file = checkFileExist();

        try {
            FileWriter fileWriter = new FileWriter(new File(pathToFile), true);
            if (!file) {
                stringBuilder.append("word");
                stringBuilder.append(',');
                stringBuilder.append("hash");
                stringBuilder.append('\n');
                stringBuilder.append(word);
                stringBuilder.append(',');
                stringBuilder.append(hash);
                stringBuilder.append('\n');
                fileWriter.write(stringBuilder.toString());
                fileWriter.flush();
                fileWriter.close();
            } else {
                stringBuilder.append(word);
                stringBuilder.append(',');
                stringBuilder.append(hash);
                stringBuilder.append('\n');
                fileWriter.write(stringBuilder.toString());
                fileWriter.flush();
                fileWriter.close();
            }

            System.out.println("Hashing completed.");
        } catch (IOException e) {
            System.out.println("Something went wrong:");
            e.printStackTrace();
        }
    }

    private void getDecryptedMessage(String hash) {
        String[] csvContent = new String[0];
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));

            while ((line = bufferedReader.readLine()) != null) {
                csvContent = line.split(",");

                if (csvContent[1].equals(hash)) {
                    System.out.println("Given hash equals word: " + csvContent[0]);
                    break;
                }
            }

            if (!csvContent[1].equals(hash) && (bufferedReader.readLine()) == null) {
                System.out.println("Given hash does not match any of the words on the list.");
            }

        } catch (IOException e) {
            System.out.println("There is something wrong with CSV file. Check it and try again.");
        }
    }

    private boolean checkFileExist() {
        File checkFile = new File(pathToFile);
        return checkFile.exists();
    }


    private void askNewMessage() {
        Scanner another = new Scanner(System.in);
        System.out.println("\nDo you want to run this exercise again? Y/N");
        String newMessage = another.nextLine();
        if (newMessage.equalsIgnoreCase("y")) {
            runExercise();
        }
    }
}