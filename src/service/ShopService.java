package service;

import model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopService {
    // цей метод створює об'єкти класу product та його товарами
    public Map<Integer, Product> createProducts() {
        Product bread = new Product("Хліб", 10, 15.0);
        Product milk = new Product("Молоко", 5, 25.0);
        Product cheese = new Product("Сир", 3, 50.0);
        Product eat = new Product("Яйца", 20, 20.0);

        Map<Integer, Product> products = new HashMap<>();
        products.put(1, bread);
        products.put(2, milk);
        products.put(3, cheese);
        products.put(4, eat);

        return products;
    }

    // цей метод виводить повний перечень товарів
    public void printProducts(Map<Integer, Product> products) {
        System.out.println("Товари з магазинчика:");
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void printProductById(Map<Integer, Product> products){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть id товару:");
        int id = scanner.nextInt();
        if (products.containsKey(id)){
            System.out.println("Товар за id " + id + ": " + products.get(id));
        }else {
            System.out.println("Невірний id. id повинен бути від 1 до " + products.size());
        }
        scanner.close();
    }
}
