package com.kodilla.good.patterns.challenges.food2door2;

public class OrderDto {

    public Order order;
    public boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }
}
