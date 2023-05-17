package list.twosided;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastListTest {

    private FirstLastList firstLastList;

    @Test
    void firstLastListIsEmpty() {
        firstLastList = new FirstLastList();
        assertTrue(firstLastList.isEmpty());
    }

    @Test
    void insertFirst() {
        firstLastList = new FirstLastList();
        firstLastList.insertFirst(23L);
        firstLastList.insertFirst(33L);
        firstLastList.insertFirst(53L);

        firstLastList.insertLast(6321L);
        firstLastList.insertLast(234L);
        firstLastList.insertLast(286L);

        firstLastList.display();

        assertEquals(53L, firstLastList.getFirst().dData);
    }
}