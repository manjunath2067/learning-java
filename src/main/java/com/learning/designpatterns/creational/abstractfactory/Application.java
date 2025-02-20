package com.learning.designpatterns.creational.abstractfactory;

import com.learning.designpatterns.creational.abstractfactory.btn.Button;
import com.learning.designpatterns.creational.abstractfactory.checkbox.CheckBox;
import com.learning.designpatterns.creational.abstractfactory.uifactory.UiFactory;

public class Application {

    private Button btn;
    private CheckBox checkBox;

    public Application(UiFactory factory){  // this is the factory of factory
        btn = factory.createBtn();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        btn.paint();
        checkBox.paint();
    }

}
