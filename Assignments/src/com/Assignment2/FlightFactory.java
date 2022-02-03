package com.Assignment2;

import java.util.Date;

public class FlightFactory {
    private FlightFactory(){

    }
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, Date departureTime)
    throws BadParameter{
        if(type.equals("commercial")){
            return new CommercialFlight(airline, origin, destination, departureTime);
        }
        else {
            return null;
        }

    }
}
