package Lesson14OOP.Task1;

public class IndustrialRealEstate extends RealEstate {

    public IndustrialRealEstate(double area, double taxK) {
        super("industrial", area, taxK);
    }

    @Override
    public double calculateTax() {
        return getArea() * getTaxK();
    }

}