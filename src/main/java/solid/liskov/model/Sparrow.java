package solid.liskov.model;

import solid.liskov.FlayingBird;

public class Sparrow implements FlayingBird {
    @Override
    public void eat() {
        System.out.println("I am Sparrow: i eat some seed. reflection ->  " + getClass().getName());
    }

    @Override
    public void fly() {
        System.out.println("I am Sparrow: reflection ->  " + getClass().getName());
    }
}
