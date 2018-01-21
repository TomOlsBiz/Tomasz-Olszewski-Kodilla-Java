package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaOrderTestSuite.class);

    @Test
    public void testBasicPizzaWithExtraCheese() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();

        //Then
        Assert.assertEquals(new BigDecimal(17.0), theCost);
        Assert.assertEquals("Pizza with tomato sauce, cheese, extra cheese", description);
        LOGGER.info(String.valueOf("Pizza cost: " + theOrder.getCost() + ". Description: " + theOrder.getDescription()));
    }

    @Test
    public void testBasicPizzaWithHam() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();

        //Then
        Assert.assertEquals(new BigDecimal(18.0), theCost);
        Assert.assertEquals("Pizza with tomato sauce, cheese, ham", description);
        LOGGER.info(String.valueOf("Pizza cost: " + theOrder.getCost() + ". Description: " + theOrder.getDescription()));
    }

    @Test
    public void testBasicPizzaWithExtraCheeseAndHam() {

        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();

        //Then
        Assert.assertEquals(new BigDecimal(20.0), theCost);
        Assert.assertEquals("Pizza with tomato sauce, cheese, extra cheese, ham", description);
        LOGGER.info(String.valueOf("Pizza cost: " + theOrder.getCost() + ". Description: " + theOrder.getDescription()));
    }
}
