package list.doublylinkedlist;

/**
 * Simulation implementation bi-way list like a LinkedList
 */
public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty () {
        return first == null && last == null;
    }

    public void insertFirst(long value) {
        Link newLink = new Link(value);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long value) {
        Link newLink = new Link(value);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link removeFirstLink() {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Link removeLastLink() {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public long getFirstItem() {
        return this.first.dData;
    }
}
