package com.kodilla.good.patterns.challenges.food2door2;

public class OrderRetriever {

    public Order retrieve() {
        Supplier supplierHealthyShop = new SupplierHealthyShop("all packaging must be in Norwegian language");
        Order supplierHealhlyShopOrder = new Order(supplierHealthyShop, "bread", 15);
        return supplierHealhlyShopOrder;
    }
}
