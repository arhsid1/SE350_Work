package com.Assignment2;

import java.util.Date;

public class TravelManager {

    public static void main(String[] args) {
        try{
            FlightManager flightManager = FlightManager.getInstance();
            String flightNum1 = flightManager.createFlight("commercial", "Atlas", "GIA", "OKT", new Date());
            String flightNum2 = flightManager.createFlight("PassengerFlight", "Talon", "TWQ", "VHN", new Date(), 400);
            System.out.println(flightManager.getFlightByNumber(flightNum1));
            System.out.println(flightManager.getFlightByNumber(flightNum2));
        }
        catch (BadParameter e) {
            e.printStackTrace();
        }
    }
}
