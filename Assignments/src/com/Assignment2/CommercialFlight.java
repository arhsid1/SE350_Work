package com.Assignment2;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight implements Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination, Date departureTime) throws BadParameter{
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime(departureTime);

    }

    public String getAirline() {
        return airline.toString();
    }

    private void setAirline(Airline airline) throws BadParameter{
        if(airline == null){
            throw new BadParameter("Passed in value cannot be null");
        }
        this.airline = airline;
    }

    public String getOrigin() {
        return origin.toString();
    }

    private void setOrigin(Airport origin) throws BadParameter{
        if(origin == null){
            throw new BadParameter("Passed in value cannot be null");
        }
        this.origin = origin;
    }

    public String getDestination() {
        return destination.toString();
    }

    private void setDestination(Airport destination) throws BadParameter{
        if(destination == null){
            throw new BadParameter("Passed in value cannot be null");
        }
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    private void setFlightNumber(){
        String uuid = UUID.randomUUID().toString();
        flightNumber = uuid;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    private void setDepartureTime(Date departureTime) throws BadParameter{
        if(departureTime == null){
            throw new BadParameter("Passed in value cannot be null");
        }
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommercialFlight)) return false;
        CommercialFlight commercialFlight = (CommercialFlight) o;
        return getAirline().equals(commercialFlight.getAirline()) && getOrigin().equals(commercialFlight.getOrigin()) && getDestination().equals(commercialFlight.getDestination()) && getFlightNumber().equals(commercialFlight.getFlightNumber()) && getDepartureTime().equals(commercialFlight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirline(), getOrigin(), getDestination(), getFlightNumber(), getDepartureTime());
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        strb.append("Flight Details:\n");
        strb.append(getAirline() + "\n");
        strb.append("Origin " + getOrigin() + "\n");
        strb.append("Destination " + getDestination() + "\n");
        strb.append("Flight Number: " + getFlightNumber() + "\n");
        strb.append("Departure Time: " + getDepartureTime() + "\n");
        return strb.toString();
    }
}
