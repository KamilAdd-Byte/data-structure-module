package list.queue;

public class LinkStack {
    private LinkList linkList;

    public LinkStack() {
        this.linkList = new LinkList();
    }

    /**
     * Put the item on top of the stack
     * @param value to add linkList
     */
    public void push (long value) {
        linkList.insert(value);
    }

    /**
     * Pick an item off the top of the stack
     * @return removed item
     */
    public long pop () {
        return linkList.removeFirst();
    }

    public boolean isEmpty () {
        return linkList.isEmpty();
    }

    public long getTop () {
        return linkList.getTop();
    }

    public int size () {
        return linkList.getSize();
    }


    public void displayStack() {
        System.out.print("Stos szczyt ---> dno: ");
        linkList.display();
    }
}
