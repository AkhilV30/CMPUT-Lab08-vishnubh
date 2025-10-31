package com.example.lab08;

import java.util.ArrayList;

/**
 * CustomList manages a list of City objects.
 * Initially, it can add new cities but does not yet
 * include the hasCity(), deleteCity(), or countCities() methods.
 */
public class CustomList {

    private ArrayList<City> cities = new ArrayList<>();

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }
}
