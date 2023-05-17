package solid.liskov.model;

import solid.liskov.Bird;

public class Hen  implements Bird {
    @Override
    public void eat() {
        System.out.println("I am Hen: Don't flay only eat. reflection ->  " + getClass().getName());
    }
}
