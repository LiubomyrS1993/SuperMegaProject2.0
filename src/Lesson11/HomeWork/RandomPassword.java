package Lesson11.HomeWork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPassword {
    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    private RandomPasswordMain randomCharacterGenerator;

    public RandomPassword() {
        this.randomCharacterGenerator = new RandomPasswordMain();
    }

    public String generatePassword() {
        List<Character> passwordList = new ArrayList<>();

        passwordList.add(randomCharacterGenerator.getRandomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        passwordList.add(randomCharacterGenerator.getRandomCharacter("abcdefghijklmnopqrstuvwxyz"));
        passwordList.add(randomCharacterGenerator.getRandomCharacter("0123456789"));
        passwordList.add('_');

        for (int i = 4; i < 8; i++) {
            passwordList.add(randomCharacterGenerator.getRandomCharacter(ALLOWED_CHARACTERS));
        }

        Collections.shuffle(passwordList);

        StringBuilder passwordBuilder = new StringBuilder();
        for (Character character : passwordList) {
            passwordBuilder.append(character);
        }

        return passwordBuilder.toString();
    }
}

