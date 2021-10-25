package com.softengine.factorymethod.buttons;

import com.softengine.factorymethod.interfaces.Button;

public class HTMLButton implements Button {

	public void render() {
		System.out.println("Renderizando button para web");
	}

	public void onClick(String event) {
		System.out.println("Recuperando evento " + event + " no click do botão");
	}
}
