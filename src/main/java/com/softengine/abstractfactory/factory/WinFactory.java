package com.softengine.abstractfactory.factory;

import com.softengine.abstractfactory.factory.win.WinButton;
import com.softengine.abstractfactory.factory.win.WinCheckbox;
import com.softengine.abstractfactory.interfaces.Button;
import com.softengine.abstractfactory.interfaces.Checkbox;
import com.softengine.abstractfactory.interfaces.GUIFactory;

public class WinFactory implements GUIFactory{

	public Button createButton() {
		return new WinButton();
	}

	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}

}
