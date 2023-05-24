package list.queue.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueFactoryTest {

    @Test
    void add() {
        QueueFactory factory = new QueueFactory();

        factory.add("dupa");
        factory.add("dupa2");
        factory.add("dupa3");
        factory.add("dupa4");
        factory.add("dupa5");

        for (String s : factory.getQueue()) {
            System.out.println("----------------------------");
            String peek = factory.getQueue().peek();

            System.out.println(s);
            System.out.println("Peek: " + peek);

            System.out.println("-----------------------------");
        }
        String poll = factory.getQueue().poll();
        System.out.println("Pool: " + poll);

        for (String s : factory.getQueue()) {
            System.out.println("------------Begin----------------");
            String peek = factory.getQueue().peek();

            System.out.println(s);
            System.out.println("Peek: " + peek);

            System.out.println("------------End-----------------");
        }

    }
}