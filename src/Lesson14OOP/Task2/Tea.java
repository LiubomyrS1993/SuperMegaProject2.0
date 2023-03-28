package Lesson14OOP.Task2;

class Tea extends Beverage {
    public Tea() {
        super(2.00);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Tea...");
    }
}
