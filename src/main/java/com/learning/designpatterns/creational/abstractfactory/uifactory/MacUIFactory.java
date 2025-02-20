package com.learning.designpatterns.creational.abstractfactory.uifactory;

import com.learning.designpatterns.creational.abstractfactory.btn.Button;
import com.learning.designpatterns.creational.abstractfactory.checkbox.CheckBox;
import com.learning.designpatterns.creational.abstractfactory.btn.MacBtn;
import com.learning.designpatterns.creational.abstractfactory.checkbox.MacCheckBox;

public class MacUIFactory implements UiFactory{

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createBtn() {
        return new MacBtn();
    }
}
