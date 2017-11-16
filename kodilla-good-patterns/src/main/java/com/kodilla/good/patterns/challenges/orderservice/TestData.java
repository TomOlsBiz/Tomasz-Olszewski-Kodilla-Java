package com.kodilla.good.patterns.challenges.orderservice;

public class TestData {

    private Customer customer;
    private Basket basket;
    private Order order;

    public TestData() {
        customer = new Customer(
                "Mark Bear",
                "mark.bear@bear.org",
                "+1800333",
                "66233 Dallas, USA");
        basket = new Basket();
        basket.addProductToBasket(new Product("Bread", 15.5), 2.0);
        basket.addProductToBasket(new Product("Porsche", 500000), 1.0);
        basket.addProductToBasket(new Product("Banana", 30), 0.5);
        order = new Order (customer, basket);
    }

    Payment payment = new Payment("Credit card", 500046);

    public Payment getPayment() {
        return payment;
    }

    public Order getOrder() {
        return order;
    }
}
