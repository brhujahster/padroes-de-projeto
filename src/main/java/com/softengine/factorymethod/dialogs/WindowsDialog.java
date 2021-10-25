package com.softengine.factorymethod.dialogs;

import com.softengine.factorymethod.Dialog;
import com.softengine.factorymethod.buttons.WindowsButton;
import com.softengine.factorymethod.interfaces.Button;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	
}
