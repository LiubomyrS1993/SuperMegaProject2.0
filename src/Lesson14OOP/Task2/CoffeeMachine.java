package Lesson14OOP.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Beverage> drinks = new ArrayList<>();
        boolean ordering = true;

        while (ordering) {
            System.out.println("Please select a drink:");
            System.out.println("1. Americano");
            System.out.println("2. Latte");
            System.out.println("3. Cappuccino");
            System.out.println("4. Tea");
            System.out.println("0. Finish ordering");

            ordering = isOrdering(scanner, drinks, ordering);
        }

        double totalCost = 0.0;
        for (Beverage drink : drinks) {
            totalCost += drink.getPrice();
        }

        System.out.println("Ordered drinks:");
        for (Beverage drink : drinks) {
            System.out.println("- " + drink.getClass().getSimpleName());
        }
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));

        System.out.println("Preparing drinks...");
        for (Beverage drink : drinks) {
            drink.prepare();
        }
    }

    private static boolean isOrdering(Scanner scanner, ArrayList<Beverage> drinks, boolean ordering) {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                drinks.add(new Americano());
                break;
            case 2:
                drinks.add(new Latte());
                break;
            case 3:
                drinks.add(new Cappuccino());
                break;
            case 4:
                drinks.add(new Tea());
                break;
            case 0:
                ordering = false;
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        return ordering;
    }
}

