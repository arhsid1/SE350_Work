package com.Assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightManager {
    private static FlightManager flightmanager;
    private static List<Flight> flights;



    public static FlightManager getInstance(){
        if(flightmanager == null) {
            flightmanager = new FlightManager();
            flights = new ArrayList<>();
        }
        return flightmanager;
    }
    private FlightManager(){
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, Date departureTime) throws BadParameter{
        Flight fly = FlightFactory.createFlight(type, airline, origin, destination, departureTime);
        flights.add(fly);
        return fly.getFlightNumber();
    }
    public Flight getFlightByNumber(String flightNum) throws BadParameter{
        Flight result = null;
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).getFlightNumber().equals(flightNum)){
                result = flights.get(i);
                break;
            }
        }
        if(result == null) {
            throw new BadParameter("There is no flight associated with this flight number");
        }
        return result;
    }
}
