package Lesson14OOP.Task2;

class Cappuccino extends Beverage {
    public Cappuccino() {
        super(3.00);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino...");
    }
}