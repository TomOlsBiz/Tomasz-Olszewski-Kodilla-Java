package com.kodilla.good.patterns.challenges.food2door2;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto ordering(Order order) {
        boolean isOrdered = orderService.order(order.getSupplier(), order.getProduct(), order.getQuantity());

        if(isOrdered) {
            informationService.information(order.getSupplier(), order);
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}
