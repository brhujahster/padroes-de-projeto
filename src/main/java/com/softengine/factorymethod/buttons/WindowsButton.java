package com.softengine.factorymethod.buttons;

import com.softengine.factorymethod.interfaces.Button;

public class WindowsButton implements Button {

	public void render() {
		System.out.println("Renderizando botão windows");
	}

	public void onClick(String event) {
		System.out.println("O evento " + event + " foi disparado");
	}
}
