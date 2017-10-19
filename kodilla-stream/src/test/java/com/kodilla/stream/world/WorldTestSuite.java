package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(new Country("Poland", new BigDecimal("38000000")));
        europeanCountries.add(new Country("Germany", new BigDecimal("83000000")));
        europeanCountries.add(new Country("Switzerland", new BigDecimal("8000000")));
        europeanCountries.add(new Country("Norway", new BigDecimal("5000000")));
        europeanCountries.add(new Country("Finland", new BigDecimal("5000000")));
        europeanCountries.add(new Country("Denmark", new BigDecimal("6000000")));
        europeanCountries.add(new Country("Sweden", new BigDecimal("10000000")));
        europeanCountries.add(new Country("France", new BigDecimal("67000000")));
        europeanCountries.add(new Country("Spain", new BigDecimal("47000000")));
        europeanCountries.add(new Country("Italy", new BigDecimal("61000000")));
        europeanCountries.add(new Country("Russia", new BigDecimal("144000000")));
        europeanCountries.add(new Country("Turkey", new BigDecimal("80000000")));
        europeanCountries.add(new Country("United Kingdom", new BigDecimal("66000000")));
        europeanCountries.add(new Country("Austria", new BigDecimal("9000000")));
        europeanCountries.add(new Country("Belgium", new BigDecimal("11000000")));
        europeanCountries.add(new Country("Netherlands", new BigDecimal("17000000")));
        europeanCountries.add(new Country("Luxembourg", new BigDecimal("600000")));

        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(new Country("Singapore", new BigDecimal("6000000")));
        asianCountries.add(new Country("Japan", new BigDecimal("127000000")));
        asianCountries.add(new Country("China", new BigDecimal("1379000000")));
        asianCountries.add(new Country("Malaysia", new BigDecimal("31000000")));
        asianCountries.add(new Country("South Korea", new BigDecimal("51000000")));
        asianCountries.add(new Country("India", new BigDecimal("1324000000")));

        List<Country> northernAmericanCountries = new ArrayList<>();
        northernAmericanCountries.add(new Country("United States of America", new BigDecimal("323000000")));
        northernAmericanCountries.add(new Country("Canada", new BigDecimal("36000000")));

        Continent europe = new Continent(europeanCountries);
        Continent asia = new Continent(asianCountries);
        Continent northernAmerica = new Continent(northernAmericanCountries);

        List<Continent> continentsOfTheWorld = new ArrayList<>();
        continentsOfTheWorld.add(europe);
        continentsOfTheWorld.add(asia);
        continentsOfTheWorld.add(northernAmerica);

        World world = new World(continentsOfTheWorld);

        //When
        BigDecimal calculatedPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3934600000");
        Assert.assertEquals(expectedPeopleQuantity, calculatedPeopleQuantity);
    }
}
