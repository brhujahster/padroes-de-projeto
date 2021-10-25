package com.softengine.abstractfactory.factory.mac;

import com.softengine.abstractfactory.interfaces.Button;

public class MacButton implements Button {

	public void paint() {
		System.out.println("Button Mac style created");
	}
}
