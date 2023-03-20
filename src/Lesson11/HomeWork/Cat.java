package Lesson11.HomeWork;

public class Cat {

    String name;
    int age;
    double weight;
    String breed;

    public Cat(){

    }

    public Cat(String name, int age, double weight, String breed){
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;

    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.weight == cat.weight && this.age == cat.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", weight=" + this.weight +
                ", breed='" + this.breed + '\'' +
                '}';
    }
}
