package com.learning.designpatterns.behavioral.command.commands;

import com.learning.designpatterns.behavioral.command.receiver.Light;

public class LightOffCommand implements Command{

    Light light;

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
