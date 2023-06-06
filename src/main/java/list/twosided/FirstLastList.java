package list.twosided;

import java.util.Date;

/**
 * A two-way list gives access to both sides, a double-way list allows you to move in both directions
 * A two-way list does not have the ability to move 'against the flow'.
 * pl: Lista dwustronna daje dostęp do obu stron, lista dwukierunkowa pozwala poruszac sie w obu kierunkach
 *     Lista dwustronna nie ma możliwości poruszania się 'pod prąd'.
 */
public class FirstLastList {

    private Link first;
    private Link last;
    private Date create;

    public FirstLastList(Link first, Link last, Date create) {
        this.first = null;
        this.last = null;
        this.create = create;
    }

    public FirstLastList() {
    }

    public long getCreate() {
        return create.getTime();
    }

    public Link getFirst() {
        return first;
    }

    public Link getLast() {
        return last;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public boolean isEmpty () {
        return first == null;
    }

    public void insertFirst (long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty())
            first = newLink;
        else
          last.next = newLink;
        last = newLink;
    }

    public long removeFirstElement() {
        long temp = first.dData;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void display(){
        System.out.printf("Lista (poczatek ---> koniec) : ");

        Link current = first;

        while (current != null) {
            current.displayDataInLog();
            current = current.next;
        }
        System.out.println("");
    }
}
