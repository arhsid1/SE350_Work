package com.Assignment2;

import java.util.*;

import static com.Assignment2.AirlineFactory.getAirline;
import static com.Assignment2.AirportFactory.getAirport;

public class FlightManager {
    private static FlightManager flightmanager;
    private static List<Flight> flights;

    private FlightManager(){
    }

    public static FlightManager getInstance(){
        if(flightmanager == null) {
            flightmanager = new FlightManager();
            flights = new ArrayList<>();
        }
        return flightmanager;
    }

    public String createFlight(String type, String airline, String origin, String destination, Date departureTime, int passengerCapacity) throws BadParameter{
        Airline a = getAirline(airline);
        Airport ori = getAirport(origin);
        Airport des = getAirport(destination);
        Flight fly = FlightFactory.createFlight(type, a, ori, des, departureTime, passengerCapacity);
        flights.add(fly);
        return fly.getFlightNumber();
    }
    public String createFlight(String type, String airline, String origin, String destination, Date departureTime) throws BadParameter{
        Airline a = getAirline(airline);
        Airport ori = getAirport(origin);
        Airport des = getAirport(destination);
        Flight fly = FlightFactory.createFlight(type, a, ori, des, departureTime, 0);
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
