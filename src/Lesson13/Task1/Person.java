package Lesson13.Task1;


public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double height;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, int age, double weight, double height) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
