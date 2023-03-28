package Lesson14OOP.Task2;

class Latte extends Beverage {
    public Latte() {
        super(3.50);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Latte...");
    }
}
