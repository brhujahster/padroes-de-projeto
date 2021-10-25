package com.softengine.abstractfactory.factory.mac;

import com.softengine.abstractfactory.interfaces.Checkbox;

public class MacCheckbox implements Checkbox {

	public void paint() {
		System.out.println("Checkbox Mac style created");
	}

}
