package com.learning.designpatterns.behavioral.command.invoker;

import com.learning.designpatterns.behavioral.command.commands.Command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
