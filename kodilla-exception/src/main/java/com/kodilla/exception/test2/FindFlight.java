package com.kodilla.exception.test2;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("WAW", true);
        airports.put("MUC", true);
        airports.put("FRA", true);
        airports.put("AKL", false);
        airports.put("ANC", false);

        if(!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())){

            throw new RouteNotFoundException("\nNo airport exists at either requested departure location or at requested arrival location.");

        } else if (airports.get(flight.getArrivalAirport()) == true) {

            System.out.println("Flight is available.");

        } else {

            System.out.println("Flight to requested arrival location is not possible.");

        }

        return airports.get(flight.getArrivalAirport());
    }
}
