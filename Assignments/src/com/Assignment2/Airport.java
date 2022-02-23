package com.Assignment2;

import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String n) throws BadParameter{
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
        if(n.length() != 3 || !(n.equals(n.toUpperCase()))){
            throw new BadParameter("Passed in value must be an all Capitalized string of length 3");
        }
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return getName().equals(airport.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Airport: " + getName();
    }

}
