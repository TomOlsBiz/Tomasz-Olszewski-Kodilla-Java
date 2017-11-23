package com.kodilla.patterns.builder.bigmac;

public class BigmacBurgers {

    private final static int BIGMAC_BURGERS_MIN = 0;
    private final static int BIGMAC_BURGERS_MAX = 9;
    private final int burgers;

    public BigmacBurgers(int burgers) {
        if(burgers < BIGMAC_BURGERS_MIN || burgers > BIGMAC_BURGERS_MAX) {
            throw new IllegalStateException("Please select number of burgers (0-9 range)");
        } else {
            this.burgers = burgers;
        }
    }

    public int getBurgers() {
        return burgers;
    }
}
