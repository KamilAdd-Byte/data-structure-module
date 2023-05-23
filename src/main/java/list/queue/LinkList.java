package list.queue;

public class LinkList {
    private Link first;
    private int size;
    public LinkList() {
        this.first = null;
        this.size = 0;
    }

    /**
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return first == null;
    }

    public long getTop () {
        return this.first.dData;
    }
    public void insert(long value) {
        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
        size++;
    }

    public int getSize() {
        return this.size;
    }

    public long removeFirst() {
        Link temp = first;
        first = first.next;
        size--;
        return temp.dData;
    }

    public void display () {
        Link current = first;

        while (current != null) {
            current.displayDataInLog();
            current = current.next;
        }
        System.out.printf("");
    }
}
