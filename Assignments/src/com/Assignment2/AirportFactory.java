package com.Assignment2;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private static Map<String, Airport> airportCache = new HashMap<String, Airport>();

    private AirportFactory() {

    }
    public static Airport getAirport(String name) throws BadParameter{
        if (!airportCache.containsKey(name)) {
            airportCache.put(name, new Airport(name));
        }
        return airportCache.get(name);
    }
}
