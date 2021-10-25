package com.softengine.abstractfactory.client;

import com.softengine.abstractfactory.factory.MacFactory;
import com.softengine.abstractfactory.factory.WinFactory;
import com.softengine.abstractfactory.interfaces.Button;
import com.softengine.abstractfactory.interfaces.GUIFactory;

public class App {

	private GUIFactory factory;
	private Button button;
	
	public App(GUIFactory factory) {
		this.factory = factory;
	}
	
	public void createUI() {
		this.button = factory.createButton();
		paint();
	}
	
	public void paint() {
		button.paint();
	}
	
	public static void main(String[] args) {
		String OS = "win";
		GUIFactory factory = null;
		
		if(OS.equals("mac")) {
			factory = new MacFactory();
		} else if(OS.equals("win")) {
			factory = new WinFactory();
		}
		
		App app = new App(factory);
		app.createUI();
	}
 }
