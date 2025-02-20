package com.learning.designpatterns.creational.abstractfactory.uifactory;

import com.learning.designpatterns.creational.abstractfactory.btn.Button;
import com.learning.designpatterns.creational.abstractfactory.checkbox.CheckBox;
import com.learning.designpatterns.creational.abstractfactory.btn.WinBtn;
import com.learning.designpatterns.creational.abstractfactory.checkbox.WinCheckBox;

public class WinUIFactory implements UiFactory{

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

    @Override
    public Button createBtn() {
        return new WinBtn();
    }
}
