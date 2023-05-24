package list.doublylinkedlist;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * two-sided list - przykładowe działanie Listy dwustronnej
 */
public class Link {
    private final Logger logger = Logger.getLogger(Link.class.getName());

    /*
    This field can be some different Object
     */
    public long dData;

    public Link next;
    public Link previous;

    public Link(long d) {
        this.dData = d;
    }
    public void displayDataInLog () {
        logger.log(Level.INFO, () -> "Link data:  " + dData);
        System.out.printf(dData + " ");
    }
}
