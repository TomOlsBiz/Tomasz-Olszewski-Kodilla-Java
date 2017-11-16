package com.kodilla.good.patterns.challenges.flights1;

public class Airport {

    private final String airportCode;

    public Airport(String airportCode) {
        this.airportCode = airportCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return airportCode.equals(airport.airportCode);
    }

    @Override
    public int hashCode() {
        return airportCode.hashCode();
    }

    @Override
    public String toString() {
        return airportCode + ' ';
    }
}
