package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> continentsOfTheWorld;

    public World(List<Continent> continentsOfTheWorld) {
        this.continentsOfTheWorld = continentsOfTheWorld;
    }

    public BigDecimal getPeopleQuantity(){
        return continentsOfTheWorld.stream()
                .flatMap(continent -> continent.getCountriesOnContinent().stream())
                .map(Country::getPeopleQuantityInTheCountry)
                .reduce(BigDecimal.ZERO,(total, current) -> total = total.add(current));
    }
}
