package com.learning.designpatterns.behavioral.command;

import com.learning.designpatterns.behavioral.command.commands.Command;
import com.learning.designpatterns.behavioral.command.commands.LightOffCommand;
import com.learning.designpatterns.behavioral.command.commands.LightOnCommand;
import com.learning.designpatterns.behavioral.command.invoker.RemoteControl;
import com.learning.designpatterns.behavioral.command.receiver.Light;

public class Main {

    public static void main(String[] args) {

        //create receiver
        Light light = new Light();

        //create concrete commands
        Command command = new LightOnCommand(light);
        Command command2 = new LightOffCommand(light);

        //create invoker
        RemoteControl remoteControl = new RemoteControl();

        // set commands and execute
        remoteControl.setCommand(command);
        remoteControl.pressButton();

//        command.undo();

    }

}

/**
 * Notes:
 *      Use the Command pattern when you want to implement reversible operations.
 *
 *  Pros:
 *      1. Open/Closed Principle: New commands can be added without modifying existing code.
 *      For example, you can add DimLightCommand without changing RemoteControl or Light.
 *
 *      2. Single Responsibility Principle
 *
 *      3. Undo/Redo
 */
