package com.softengine.factorymethod.dialogs;

import com.softengine.factorymethod.Dialog;
import com.softengine.factorymethod.buttons.HTMLButton;
import com.softengine.factorymethod.interfaces.Button;

public class WebDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HTMLButton();
	}

}
