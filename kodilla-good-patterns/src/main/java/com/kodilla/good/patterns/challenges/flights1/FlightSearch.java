package com.kodilla.good.patterns.challenges.flights1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private final HashMap<String, Flight> flightSchedule = new HashMap<>();

    public void addFlight(Flight flight) {
        flightSchedule.put(flight.getFlightCode(), flight);
    }

    public List<Flight> searchByDepartureAirport(Airport airport) {
        List<Flight> resultsByDepartureAirport = flightSchedule.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
        return resultsByDepartureAirport;
    }

    public List<Flight> searchByArrivalAirport(Airport airport) {
        List<Flight> resultsByArrivalAirport = flightSchedule.values().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
        return resultsByArrivalAirport;
    }

    public List<Flight> searchForTransferFlight(Airport departureAirport, Airport finalDestinationAirport, Airport transferAirport) {
        List<Flight> resultsOfTransferFlights = new ArrayList<>();

        Flight searchForFirstFlight = flightSchedule.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(transferAirport))
                .findAny().get();
        Flight searchForSecondFlight = flightSchedule.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transferAirport))
                .filter(flight -> flight.getArrivalAirport().equals(finalDestinationAirport))
                .findAny().get();

        resultsOfTransferFlights.add(searchForFirstFlight);
        resultsOfTransferFlights.add(searchForSecondFlight);
        return resultsOfTransferFlights;
    }
}