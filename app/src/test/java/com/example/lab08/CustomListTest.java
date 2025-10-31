package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit test for CustomList.
 * This test follows TDD:
 * Step 1 (RED): Write a failing test for hasCity().
 * Step 2 (GREEN): Implement hasCity() in CustomList.java.
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
}
