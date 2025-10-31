import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {

    @Test
    public void hasCity_returnsTrueWhenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Fails now because hasCity() doesn't exist/return true yet
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void hasCity_returnsFalseWhenAbsent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        assertFalse(list.hasCity(edmonton));
    }
}
