package com.kodilla.good.patterns.challenges.flights1;

public class Flight {

    private final String flightCode;
    private final Airport departureAirport;
    private final Airport arrivalAirport;

    public Flight(String flightCode, Airport departureAirport, Airport arrivalAirport) {
        this.flightCode = flightCode;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightCode.equals(flight.flightCode)) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = flightCode.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "departure airport " + departureAirport +
                ", arrival airport " + arrivalAirport + "\n";
    }
}
