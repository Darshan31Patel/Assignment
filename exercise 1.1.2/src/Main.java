import command.*;
import devices.*;

public class Main {
    public static void main(String[] args) {
        // Create the devices
        Light livingRoomLight = new Light();
        Fan livingRoomFan = new Fan();

        // Create the command objects for Light and Fan
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(livingRoomFan);
        Command fanOff = new FanOffCommand(livingRoomFan);

        // Simulate the remote control operations
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
        
        // Undo last command (turns the light back on)
        remote.pressUndo();
        
        // Turn the fan on
        remote.setCommand(fanOn);
        remote.pressButton();

        // Undo last command (turns the fan off)
        remote.pressUndo();
    }
}