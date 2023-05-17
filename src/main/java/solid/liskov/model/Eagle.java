package solid.liskov.model;

import solid.liskov.FlayingBird;

public class Eagle implements FlayingBird {
    @Override
    public void eat() {
        System.out.println("I am Eagle: i eat mouse. reflection ->  " + getClass().getName());
    }

    @Override
    public void fly() {
        System.out.println("I am Eagle: i can flay. reflection ->  " + getClass().getName());
    }
}
