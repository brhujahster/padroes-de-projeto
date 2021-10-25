package com.softengine.factorymethod;

import com.softengine.factorymethod.config.ConfigFile;
import com.softengine.factorymethod.dialogs.WebDialog;
import com.softengine.factorymethod.dialogs.WindowsDialog;

public class App {

	
	public Dialog initialize() {
		Dialog dialog = null;
		
		ConfigFile config = new ConfigFile();
		
		if(config.getOs().equals("windows")) {
			dialog = new WindowsDialog();
		} else if(config.getOs().equals("web")) {
			dialog = new WebDialog();
		} else {
			throw new RuntimeException("Sistema operacional não reconhecido");
		}
		
		return dialog;
	}
	
	public static void main(String[] args) {
		App app = new App();
		Dialog dialog = app.initialize();
		dialog.render();
	}
}
