package com.example.lab08;

import java.util.ArrayList;

/**
 * CustomList manages a list of City objects.
 * Initially, it could only add new cities.
 * Now, after implementing TDD (GREEN phase),
 * it includes the hasCity() method.
 */
public class CustomList {

    private ArrayList<City> cities = new ArrayList<>();

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Checks if the given city exists in the list.
     * @param city the City object to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
}
