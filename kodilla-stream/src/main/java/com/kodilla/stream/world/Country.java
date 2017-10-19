package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantityInTheCountry;

    public Country(String countryName, BigDecimal peopleQuantityInTheCountry) {
        this.countryName = countryName;
        this.peopleQuantityInTheCountry = peopleQuantityInTheCountry;
    }

    public BigDecimal getPeopleQuantityInTheCountry() {
        return peopleQuantityInTheCountry;
    }
}

