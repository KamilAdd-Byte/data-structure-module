package list.queue;

public class LinkQueue {
    private FirstLastList list;

    public LinkQueue() {
        this.list = new FirstLastList();
    }

    public boolean isEmpty () {
        return this.list.isEmpty();
    }

    /**
     * Insert value as last to queue
     * @param value
     */
    public void insertValueLastQueue (long value) {
        this.list.insertLast(value);
    }

    public long remove () {
        return this.list.removeFirstElement();
    }
}
