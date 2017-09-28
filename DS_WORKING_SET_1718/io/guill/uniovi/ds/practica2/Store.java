package io.guill.uniovi.ds.practica2;

public class Store implements IInstruction {
	
	public Store(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		int value = comp.stack().pop();
		int address = comp.stack().pop();
		comp.memory().set(address, value);
	}

}
