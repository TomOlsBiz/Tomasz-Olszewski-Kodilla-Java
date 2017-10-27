package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("WAW", true);
        airports.put("MUC", true);
        airports.put("FRA", true);
        airports.put("AKL", false);
        airports.put("ANC", false);


        if(airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport()) == true && airports.get(flight.getArrivalAirport()) == true) {

            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");

        } else if (airports.containsKey(flight.getDepartureAirport()) && airports.containsKey(flight.getArrivalAirport())) {

            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available.");
            System.out.println("Airport is not accepting flights either at requested departure location or at requested arrival location.");

        } else {

            throw new RouteNotFoundException("\nNo airport exists at either requested departure location or at requested arrival location.");

        }
    }
}
