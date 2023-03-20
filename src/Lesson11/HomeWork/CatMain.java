package Lesson11.HomeWork;

public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Bob", 2, 3.0, "Maine Coon");
        System.out.println(cat);

        Cat cat2 = new Cat("Murka", 2, 3.0, "Persian");
        System.out.println(cat2);

        ageAndWeight(cat, cat2);


    }

    private static void ageAndWeight(Cat cat, Cat cat2) {
        if (cat.equals(cat2)){
            System.out.println("The cats have equal age and wight\n" + cat.equals(cat2));
        } else {
            System.out.println("The cats have different age or weight\n" + cat.equals(cat2));
        }
    }

}
