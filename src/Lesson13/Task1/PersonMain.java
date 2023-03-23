package Lesson13.Task1;

import java.util.Random;

public class PersonMain {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "Dave", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Jasmine"};
        String[] surNames = {"Smith", "Drug", "Calif", "Dove", "Swarz", "Franky4", "Hill", "Green", "Who", "Clop"};
        Random random = new Random();
        Person[] person = new Person[100];

        randomPerson(names, surNames, random, person);
    }

    private static void randomPerson(String[] names, String[] surNames, Random random, Person[] person) {
        for (int i = 0; i < person.length; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surNames[random.nextInt(names.length)];
            int age = 18 + random.nextInt(83);
            double weight = 50 + random.nextGaussian() * 20;
            double height = 150 + random.nextGaussian() * 20;
            person[i] = new Person(name, surname, age, weight, height);
            System.out.println(person[i]);
        }
    }


}
