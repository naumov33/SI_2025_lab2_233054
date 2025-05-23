import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryStatement() {

        RuntimeException e1 = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(null, "1234567812345678"));
        assertEquals("allItems list can't be null!", e1.getMessage());


        Item item1 = new Item(null, 1, 100, 0);
        RuntimeException e2 = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(List.of(item1), "1234567812345678"));
        assertEquals("Invalid item!", e2.getMessage());


        Item item2 = new Item("Book", 2, 100, 0);
        double result = SILab2.checkCart(List.of(item2), "1234567812345678");
        assertEquals(200, result);


        RuntimeException e3 = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(List.of(item2), "1234apjs56tadsa"));
        assertEquals("Invalid character in card number!", e3.getMessage());


        Item item3 = new Item("Phone", 11, 400, 0.2);
        double result2 = SILab2.checkCart(List.of(item3), "1234567812345678");
        assertEquals(-30 + 400 * (1 - 0.2) * 11, result2);
    }

    @Test
    public void testMultipleCondition() {

        // T X X
        Item a = new Item("A", 1, 301, 0);
        // F T X
        Item b = new Item("B", 1, 100, 0.1);
        // F F T
        Item c = new Item("C", 11, 100, 0);
        // F F F
        Item d = new Item("D", 1, 100, 0);


        assertTrue(SILab2.checkCart(List.of(a), "1234567812345678") < 301);
        assertTrue(SILab2.checkCart(List.of(b), "1234567812345678") < 100 * 0.9);
        assertTrue(SILab2.checkCart(List.of(c), "1234567812345678") < 1100);
        assertEquals(100, SILab2.checkCart(List.of(d), "1234567812345678"));
    }
}
