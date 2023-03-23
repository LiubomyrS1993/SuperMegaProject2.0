package Lesson13.Task2;

public class PersonMain {

    public static void main(String[] args) {

        Person grandpa = new Person("John", null, null);
        Person grandma = new Person("Mary", null, null);

        DescribePerson grandFather = new DescribePerson("John", 77, 70.0f, 1.80f);
        DescribePerson grandMother = new DescribePerson("Mary", 75, 60.0f, 1.72f);

        Person grandpa2 = new Person("Bro", null, null);
        Person grandma2 = new Person("Siu", null, null);


        Person dad = new Person("Bob", grandpa, grandma);
        Person mom = new Person("Jane", grandpa2, grandma2);


        Person child = new Person("Alice", dad, mom);


        System.out.println("Name: " + child.getName());
        System.out.println("Father: " + child.getFather().getName());
        System.out.println("Mother: " + child.getMother().getName());
        System.out.println("Grandfather (father's side): " + child.getFather().getFather().getName() + " " + grandFather);
        System.out.println("Grandmother (father's side): " + child.getFather().getMother().getName() + " " + grandMother);




        System.out.println("Name: " + child.getName());
        System.out.println("Father: " + child.getFather().getName());
        System.out.println("Mother: " + child.getMother().getName());
        System.out.println("Grandmother (mother's side): " + child.getMother().getMother().getName());
        System.out.println("Grandfather (mother's side): " + child.getMother().getFather().getName());


    }

}
