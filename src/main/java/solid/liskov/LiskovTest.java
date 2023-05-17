package solid.liskov;

import solid.liskov.model.Eagle;
import solid.liskov.model.Hen;
import solid.liskov.model.Sparrow;

public class LiskovTest {
    public static void main(String[] args) {

        Bird[] birds = new Bird[]{new Hen()};
        FlayingBird[] flayingBirds = new FlayingBird[]{new Sparrow(), new Eagle() };

        for (FlayingBird flayingBird : flayingBirds) {
            flayingBird.fly();
            flayingBird.eat();
        }
        System.out.println("/n========================================/n");
        for (Bird bird : birds) {
            bird.eat();
        }

    }
}
