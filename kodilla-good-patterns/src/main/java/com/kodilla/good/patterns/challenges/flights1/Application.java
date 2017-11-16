package com.kodilla.good.patterns.challenges.flights1;

public class Application {
    public static void main(String[] args) {
        Airport waw = new Airport("WAW");
        Airport osl = new Airport("OSL");
        Airport hel = new Airport("HEL");
        Airport arl = new Airport("ARL");
        Airport cph = new Airport("CPH");

        FlightSearch flightSearch = new FlightSearch();
        flightSearch.addFlight(new Flight("SK1", waw, hel));
        flightSearch.addFlight(new Flight("SK2", hel, arl));
        flightSearch.addFlight(new Flight("SK3", osl, cph));
        flightSearch.addFlight(new Flight("DY1", waw, osl));
        flightSearch.addFlight(new Flight("DY2", osl, hel));
        flightSearch.addFlight(new Flight("DY3", hel, osl));

        System.out.println("Flights by selected departure airport");
        System.out.println(flightSearch.searchByDepartureAirport(waw));
        System.out.println("Flights by selected arrival airport");
        System.out.println(flightSearch.searchByArrivalAirport(osl));
        System.out.println("Transfer flights");
        System.out.println(flightSearch.searchForTransferFlight(waw,cph,osl));
    }
}
