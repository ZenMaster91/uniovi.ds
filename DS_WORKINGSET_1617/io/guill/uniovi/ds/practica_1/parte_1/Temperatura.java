package io.guill.uniovi.ds.practica_1.parte_1;

/**
 * Socket for a temperature where we store it in celsius and can work with
 * farenheit it in both units.
 * 
 * @version 3.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class Temperatura {

	private double celsius;

	public Temperatura(double celsius) {
		setCelsius(celsius);
	}

	/**
	 * Devuelve el valor de la temperatura en celsius.
	 * 
	 * @return el valor de la temperatura en celsius.
	 */
	public double getCelsius() {
		return this.celsius;
	}

	/**
	 * Cambia el valor de la temperatura en celsius.
	 * 
	 * @param celsius
	 *            son los nuevos grados a establecer como temperatura.
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	/**
	 * Devuelve el valor de la temperatura en farenheit.
	 * 
	 * @return el valor de la temperatura en farenheit.
	 */
	public double getFarenheit() {
		return this.celsius * 1.8 + 32;
	}

	/**
	 * Cambia el valor de la temperatura a farenheit.
	 * 
	 * @param farenheit
	 *            son los grados a establecer como temperatura.
	 */
	public void setFarenheit(double farenheit) {
		this.celsius = (farenheit - 32) / 1.8;
	}

}
