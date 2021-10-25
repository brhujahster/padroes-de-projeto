package com.softengine.abstractfactory.factory.win;

import com.softengine.abstractfactory.interfaces.Checkbox;

public class WinCheckbox implements Checkbox {

	public void paint() {
		System.out.println("checkbox windows style created");
	}

}
