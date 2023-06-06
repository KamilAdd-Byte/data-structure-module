package pattern.behavior.command;

/**
 * Concrete command
 */
public class LightOffCommand implements Command {

    /*
    reference on the Light class
     */
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
        System.out.println("Light is Off");
    }
}
