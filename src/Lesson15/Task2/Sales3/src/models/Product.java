package Lesson15.Task2.Sales3.src.models;


import Lesson15.Task2.Sales3.src.base.Fiscal;
import Lesson15.Task2.Sales3.src.base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.


public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private final double taxRate = 0.05;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return income() * taxRate;
    }

    @Override
    public double income() {
        return quantity * price;
    }

    @Override
    public double income(double tax) {
        return income() - tax;
    }
}
