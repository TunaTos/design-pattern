package behavioral.Command.exercise1;


// Command interface
interface Command {
    void execute();
    void undo();
}

// Receiver : objects that perform actual work
class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is ON");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}


class TV {
    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}

// ConcreteCommand - Concrete commands
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}

// Invoker - Remote control that executes commands
class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        lastCommand.undo();
    }
}


class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
public class Main {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        TV tv = new TV();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        TVOnCommand tvOn = new TVOnCommand(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, tvOn, new NoCommand());

        // Execute commands
        System.out.println("=== Remote Control Test ===");
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        System.out.println();
        remote.onButtonPressed(1);
        remote.undoButtonPressed();

        System.out.println();
        remote.onButtonPressed(2);
    }
}
