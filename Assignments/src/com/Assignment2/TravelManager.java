package com.Assignment2;

import java.util.Date;

public class TravelManager {

    public static void main(String[] args) {
        try{
            FlightManager flightManager = FlightManager.getInstance();
            flightManager.createFlight("commercial", new Airline("Atlas"), new Airport("GIA"), new Airport("OKT"), new Date());
        }
        catch (BadParameter e) {
            e.printStackTrace();
        }
    }
}
