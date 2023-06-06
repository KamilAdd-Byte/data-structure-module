package pattern.behavior.command;


/**
 * Concrete command
 */
public class LightOnCommand implements Command {

    /*
    reference on the Light class
     */
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
        System.out.println("Light is On");
    }

    @Override
    public String toString() {
        return "LightOnCommand {" +
                "light=" + light +
                '}';
    }
}
