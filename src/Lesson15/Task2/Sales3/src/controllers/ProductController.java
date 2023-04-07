package Lesson15.Task2.Sales3.src.controllers;

import Lesson15.Task2.Sales3.src.models.Product;
import Lesson15.Task2.Sales3.src.utils.Rounder;
import Lesson15.Task2.Sales3.src.views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;
    private double taxRate;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();
        double income = model.income();
        double tax = model.calculateTax();
        double netIncome = model.income(tax);

        String output = "Наименование товара: " + name + "\n" +
                "Общий доход (грн.): " + Rounder.round(income) + "\n" +
                "Сумма налога (грн.): " + Rounder.round(tax) + "\n" +
                "Чистый доход (грн.): " + Rounder.round(netIncome);

        view.getOutput(output);
    }
}
