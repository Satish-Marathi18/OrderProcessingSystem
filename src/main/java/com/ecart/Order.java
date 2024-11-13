package com.ecart;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product p) {
        products.add(p);
    }

    double calculateTotalPrice() {
        double totalPrice = 0;
        for(Product p : products) {
            totalPrice += p.getPrice() * p.getQuantity();
        }
        return totalPrice;
    }
}
