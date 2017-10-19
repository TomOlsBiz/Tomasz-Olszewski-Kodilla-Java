package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final List<Country> countriesOnContinent;

    public Continent(List<Country> countriesOnContinent) {
        this.countriesOnContinent = countriesOnContinent;
    }

    public List<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }
}
