package com.Assignment2;

import java.util.Date;

public class FlightFactory {

    private FlightFactory(){
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, Date departureTime, int passengerCapacity)
    throws BadParameter{
        if(type.equals("commercial")){
            return new CommercialFlight(airline, origin, destination, departureTime);
        }
        else if(type.equals("PassengerFlight")){
            return new PassengerFlight(airline, origin, destination, departureTime, passengerCapacity);
        }
        else {
            return null;
        }

    }
}
