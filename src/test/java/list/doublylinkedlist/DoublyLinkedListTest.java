package list.doublylinkedlist;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void insertFirst() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertFirst(12L);
        doublyLinkedList.insertFirst(14L);
        doublyLinkedList.insertFirst(143L);
        doublyLinkedList.insertFirst(19L);

        doublyLinkedList.removeFirstLink();
        assertEquals(143L, doublyLinkedList.getDataForFirstLink());

        doublyLinkedList.removeFirstLink();
        assertEquals(14L, doublyLinkedList.getDataForFirstLink());
    }
}