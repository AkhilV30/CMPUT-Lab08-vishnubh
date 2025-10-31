package com.example.lab08;

import java.util.ArrayList;

/**
 * CustomList manages a list of City objects.
 * Initially, it can add new cities and now includes:
 * - hasCity()
 * - deleteCity()
 * - countCities()
 */
public class CustomList {

    private ArrayList<City> cities = new ArrayList<>();

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /** Adds a city to the list */
    public void addCity(City city) {
        cities.add(city);
    }

    /** Checks whether the given city exists in the list */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /** Deletes the given city from the list.
     *  Throws an exception if the city does not exist.
     */
    public void deleteCity(City city) {
        // Try to remove; if not found, throw an error
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not found in the list");
        }
    }

    /** Returns the total number of cities in the list */
}
