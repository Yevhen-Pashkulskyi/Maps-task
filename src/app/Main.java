package app;

import model.Product;
import service.ShopService;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();

        Map<Integer, Product> products = shopService.createProducts();

        shopService.printProducts(products);
        shopService.printProductById(products);
    }
}
