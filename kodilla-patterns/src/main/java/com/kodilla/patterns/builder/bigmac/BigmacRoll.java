package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class BigmacRoll {

    private final static List<String> BIGMAC_ROLLS = Arrays.asList("SESAME ROLL", "NON-SESAME ROLL");
    private final String roll;

    public BigmacRoll(String roll) {
        if(BIGMAC_ROLLS.contains(roll)) {
            this.roll = roll;
        } else {
            throw new IllegalStateException("Please select either SESAME ROLL or NON-SESAME ROLL");
        }
    }

    public String getRoll() {
        return roll;
    }
}
