package list.queue.implementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueFactory {
    private Queue<String> queue;

    public QueueFactory() {
        this.queue = new PriorityQueue<>();
    }

    public void add (String value) {
        queue.add(value);
        System.out.println("Add to Queue: " + value);
    }

    public Queue<String> getQueue () {
        return this.queue;
    }
}
