package com.Assignment2;

import java.util.Objects;

public class Airline {
    private String name;

    public Airline(String n) throws BadParameter{
        setName(n);
    }

    public String getName() {
        return name;
    }
    private void setName(String n)
            throws BadParameter{
        if(n == null){
            throw new BadParameter("Passed in value is null");
        }
        if(n.length() >= 8){
            throw new BadParameter("Passed in value must be a string of less than 8 characters");
        }
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return getName().equals(airline.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Airline: " + getName();
    }


}
