package Lesson11.HomeWork;

import java.security.SecureRandom;

public class RandomPasswordMain {
    private static final SecureRandom random = new SecureRandom();

    public char getRandomCharacter(String characterSet) {
        int randomIndex = random.nextInt(characterSet.length());
        return characterSet.charAt(randomIndex);


    }

    public static void main(String[] args) {
        RandomPassword passwordGenerator = new RandomPassword();
        String password = passwordGenerator.generatePassword();
        System.out.println("Generated password: " + password);
    }
}
