package Lesson14OOP.Task1;

public class RealEstateMain {

    public static void main(String[] args) {
        ResidentialRealEstate residential = new ResidentialRealEstate(100.0, 10.0, 0.1);
        CommercialRealEstate commercial = new CommercialRealEstate(200.0, 5.0, 5000.0);
        IndustrialRealEstate industrial = new IndustrialRealEstate(300.0, 3.0);

        System.out.println("Residential property tax: " + residential.calculateTax());
        System.out.println("Commercial property tax: " + commercial.calculateTax());
        System.out.println("Industrial property tax: " + industrial.calculateTax());
    }

}
