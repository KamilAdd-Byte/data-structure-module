package pattern.behavior;

import pattern.behavior.command.*;

public class Test {
    public static void main(String[] args) {

        RemoteControl control = new RemoteControl();
        Light light = new Light();

        Command commandLightOn = new LightOnCommand(light);
        Command commandLightOff = new LightOffCommand(light);

        control.setCommand(commandLightOn);
        control.pressButton();

        control.setCommand(commandLightOff);
        control.pressButton();

    }
}
