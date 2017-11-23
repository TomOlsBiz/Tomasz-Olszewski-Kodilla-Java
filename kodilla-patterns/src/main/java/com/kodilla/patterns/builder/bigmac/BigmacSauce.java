package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class BigmacSauce {

    private final static List<String> BIGMAC_SAUCE = Arrays.asList("STANDARD", "1000 ISLANDS", "BARBECUE");
    private final String sauce;

    public BigmacSauce(String sauce) {
        if(BIGMAC_SAUCE.contains(sauce)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Please select sauce: STANDARD, 1000 ISLANDS or BARBECUE");
        }
    }

    public String getSauce () {
        return sauce;
    }
}
