package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {

        //Given and When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("SESAME ROLL")
                .burgers(7)
                .sauce("1000 ISLANDS")
                .ingredient("ONION")
                .ingredient("SHRIMPS")
                .ingredient("BACON")
                .build();
        System.out.println(bigmac);

        //Then
        Assert.assertEquals("SESAME ROLL", bigmac.getRollBuilder().getRoll());
        Assert.assertEquals(7, bigmac.getBurgersBuilder().getBurgers());
        Assert.assertEquals("1000 ISLANDS", bigmac.getSauceBuilder().getSauce());
        Assert.assertEquals(3, bigmac.getIngredientsBuilder().size());
        Assert.assertEquals("ONION", bigmac.getIngredientsBuilder().get(0).getIngredient());
    }
}
