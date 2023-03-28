package Lesson14OOP.Task2;

class Americano extends Beverage {
    public Americano() {
        super(2.50);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Americano...");
    }
}
