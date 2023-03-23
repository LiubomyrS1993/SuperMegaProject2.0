package Lesson13.Task2;

public class Person {
    private String name;
    private Person father;
    private Person mother;

    public Person(String name, Person father, Person mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

}
