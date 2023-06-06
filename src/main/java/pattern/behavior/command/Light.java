package pattern.behavior.command;

/**
 * Receiver
 */
public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Light {" +
                "isOn=" + isOn +
                '}';
    }
}
