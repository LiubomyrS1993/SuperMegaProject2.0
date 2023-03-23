package Lesson13.Task2;

public class DescribePerson {

    private String name;
    private int age;
    private float weight;
    private float height;


    public DescribePerson (String name, int age, float weight, float height){

        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;


    }

    @Override
    public String toString() {
        return " Here some characteristic of the person: {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
