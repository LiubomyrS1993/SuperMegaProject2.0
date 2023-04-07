package Lesson15.Task2.Sales3.src;

import Lesson15.Task2.Sales3.src.controllers.ProductController;
import Lesson15.Task2.Sales3.src.models.Product;
import Lesson15.Task2.Sales3.src.views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {


        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр

        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        controller.runApp();
    }
}
