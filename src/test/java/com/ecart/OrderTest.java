package com.ecart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void calculateTotalPriceTest1() {
        Product p1 = new Product("Mobile",1000.0, 2);
        Product p2 = new Product("Laptop",4000.0, 3);
        order.addProduct(p1);
        order.addProduct(p2);
        assertEquals(14000.0, order.calculateTotalPrice());
    }

    @Test
    void calculateTotalPriceTest2() {
        assertEquals(0.0, order.calculateTotalPrice());
    }
}
