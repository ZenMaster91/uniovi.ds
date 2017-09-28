package io.guill.uniovi.ds.practica2;

public class Jmpg implements IInstruction {
	
	private int address;
	
	public Jmpg(Computer comp, int address) {
		this.address = address;
		operation(comp);
	}

	@Override
	public void operation(Computer comp) {
		int b = comp.stack().pop();
		int a = comp.stack().pop();
		if (a > b) {
			comp.ip().set(address);
		} else {
			increaseIP(comp);
		}
	}

}
