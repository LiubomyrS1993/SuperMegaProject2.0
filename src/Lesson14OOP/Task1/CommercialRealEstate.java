package Lesson14OOP.Task1;

public class CommercialRealEstate extends RealEstate {
    private double revenue;

    public CommercialRealEstate(double area, double taxK, double revenue) {
        super("commercial", area, taxK);
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    @Override
    public double calculateTax() {
        if (getRevenue() < 100.0) {
            return 0.0;
        }
        return getArea() * getTaxK();
    }
}
