package com.softengine.abstractfactory.factory;

import com.softengine.abstractfactory.factory.mac.MacButton;
import com.softengine.abstractfactory.factory.mac.MacCheckbox;
import com.softengine.abstractfactory.interfaces.Button;
import com.softengine.abstractfactory.interfaces.Checkbox;
import com.softengine.abstractfactory.interfaces.GUIFactory;

public class MacFactory implements GUIFactory{

	public Button createButton() {
		return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

	
}
