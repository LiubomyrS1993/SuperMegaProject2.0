package Lesson14OOP.Task1;

public class ResidentialRealEstate extends RealEstate {

    private double subsidyPercentage;

    public ResidentialRealEstate(double area, double taxK, double subsidyPercentage) {
        super("residential", area, taxK);
        this.subsidyPercentage = subsidyPercentage;
    }

    public double getSubsidyPercentage() {
        return subsidyPercentage;
    }

    @Override
    public double calculateTax() {
        double totalCost = getArea() * getTaxK();
        double subsidy = totalCost * getSubsidyPercentage();
        double taxableCost = totalCost - subsidy;
        return taxableCost * getTaxK();
    }

}
