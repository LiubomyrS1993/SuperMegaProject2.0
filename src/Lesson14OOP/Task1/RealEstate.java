package Lesson14OOP.Task1;

public abstract class RealEstate {
    private String type;
    private double area;
    private double taxK;

    public RealEstate(String type, double area, double taxK) {
        this.type = type;
        this.area = area;
        this.taxK = taxK;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public double getTaxK() {
        return taxK;
    }

    public abstract double calculateTax();

}