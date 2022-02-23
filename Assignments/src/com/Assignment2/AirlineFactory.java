package com.Assignment2;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<String, Airline>();

    private AirlineFactory() {

    }
    public static Airline getAirline(String name) throws BadParameter{
        if (!airlineCache.containsKey(name)) {
            airlineCache.put(name, new Airline(name));
        }
        return airlineCache.get(name);
    }
}
