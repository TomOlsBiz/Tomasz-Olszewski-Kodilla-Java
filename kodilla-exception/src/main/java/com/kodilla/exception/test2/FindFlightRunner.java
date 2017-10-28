package com.kodilla.exception.test2;

public class FindFlightRunner {

    public static void main(String args[]) {

        FindFlight findFlight = new FindFlight();

        Flight[] flightsEnquired = new Flight[10];
        flightsEnquired[0] = new Flight("WAW", "ANC");
        flightsEnquired[1] = new Flight("WAW", "FRA");
        flightsEnquired[2] = new Flight("WAW", "MUC");
        flightsEnquired[3] = new Flight("WAW", "Green");
        flightsEnquired[4] = new Flight("ANC", "Blue");
        flightsEnquired[5] = new Flight("FRA", "Yellow");
        flightsEnquired[6] = new Flight("Red", "Pink");
        flightsEnquired[7] = new Flight("MUC", "FRA");
        flightsEnquired[8] = new Flight("FRA", "ANC");
        flightsEnquired[9] = new Flight("FRA", "AKL");

        int n = 1;


        for(Flight flight: flightsEnquired) {

            System.out.println("Flight enquired #" + n + ": from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + ".");

            try {

                findFlight.findFlight(flight);

            } catch (RouteNotFoundException e) {

                System.out.println(e);

            } finally {

                System.out.println();
                n++;

            }
        }
    }
}
