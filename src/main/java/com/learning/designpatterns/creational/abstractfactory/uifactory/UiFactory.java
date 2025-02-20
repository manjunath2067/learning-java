package com.learning.designpatterns.creational.abstractfactory.uifactory;

import com.learning.designpatterns.creational.abstractfactory.btn.Button;
import com.learning.designpatterns.creational.abstractfactory.checkbox.CheckBox;

public interface UiFactory {

    CheckBox createCheckBox();

    Button createBtn();
}

