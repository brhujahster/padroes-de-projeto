package com.softengine.factorymethod;

import com.softengine.factorymethod.interfaces.Button;

public abstract class Dialog {

	public void render() {
		Button okButton = createButton();
		okButton.onClick("event");
		okButton.render();
	}
	
	public abstract Button createButton();
}
