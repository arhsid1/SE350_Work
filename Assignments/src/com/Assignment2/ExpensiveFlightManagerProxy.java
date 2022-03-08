package com.Assignment2;

import java.util.Date;

public class ExpensiveFlightManagerProxy implements ExpensiveFlightManager {
    private static FlightManager flightManager;

    public String createFlight(String type, String airline, String origin, String destination, Date departureTime, int passengerCapacity) throws BadParameter{
        System.out.println("A flight is being created");
        flightManager = FlightManager.getInstance();
        return flightManager.createFlight(type, airline, origin, destination, departureTime, passengerCapacity);
    }

    public String createFlight(String type, String airline, String origin, String destination, Date departureTime) throws BadParameter{
        System.out.println("A flight is being created");
        flightManager = FlightManager.getInstance();
        return flightManager.createFlight(type, airline, origin, destination, departureTime);
    }

    public Flight getFlightByNumber(String flightNum) throws BadParameter {
        System.out.println("Flight number: " + flightNum + " is being retrieved");
        flightManager = FlightManager.getInstance();
        return flightManager.getFlightByNumber(flightNum);
    }
}
