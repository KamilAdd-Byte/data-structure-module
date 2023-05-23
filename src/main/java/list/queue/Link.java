package list.queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * two-sided list - przykładowe działanie Listy dwustronnej
 */
public class Link {
    Logger logger = Logger.getLogger(Link.class.getName());
    public long dData;
    public Link next;

    public Link(long d) {
        this.dData = d;
    }
    public void displayDataInLog () {
        logger.log(Level.INFO, () -> "Link data:  " + dData);
        System.out.printf(dData + " ");
    }
}
