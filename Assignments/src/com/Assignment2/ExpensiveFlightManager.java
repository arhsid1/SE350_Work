package com.Assignment2;

import java.util.Date;

public interface ExpensiveFlightManager {
    public String createFlight(String type, String airline, String origin, String destination, Date departureTime, int passengerCapacity) throws BadParameter;
    public String createFlight(String type, String airline, String origin, String destination, Date departureTime) throws BadParameter;
    public Flight getFlightByNumber(String flightNum) throws BadParameter;
}
