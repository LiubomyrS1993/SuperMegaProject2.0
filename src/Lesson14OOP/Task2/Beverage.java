package Lesson14OOP.Task2;


abstract class Beverage {
    private double price;

    public Beverage(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void prepare();
}


