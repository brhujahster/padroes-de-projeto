package com.softengine.abstractfactory.factory.win;

import com.softengine.abstractfactory.interfaces.Button;

public class WinButton implements Button {

	public void paint() {
		System.out.println("Windows Button style created");
	}

}
