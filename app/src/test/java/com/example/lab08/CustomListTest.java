package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for CustomList.
 * This test follows TDD:
 * Step 1 (RED): Write failing tests for hasCity() and deleteCity().
 * Step 2 (GREEN): Implement both methods in CustomList.java.
 */
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist yet
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
}
