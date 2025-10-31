package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for CustomList.
 * This test follows TDD:
 * Step 1 (RED): Write failing tests for hasCity(), deleteCity(), and countCities().
 * Step 2 (GREEN): Implement all methods in CustomList.java.
 */
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Verify that hasCity() detects existing cities
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        // Ensure both are present
        assertTrue(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));

        // Delete one city
        list.deleteCity(edmonton);

        // Verify it was removed and the other remains
        assertFalse(list.hasCity(edmonton));
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City vancouver = new City("Vancouver", "BC");

        // Initially list is empty
        assertEquals(0, list.countCities());

        // Add cities and verify count increases
        list.addCity(calgary);
        list.addCity(edmonton);
        assertEquals(2, list.countCities());

        // Add one more
        list.addCity(vancouver);
        assertEquals(3, list.countCities());

        // Delete one and verify count decreases
        list.deleteCity(edmonton);
        assertEquals(2, list.countCities());
    }
}
