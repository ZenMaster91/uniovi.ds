package io.guill.uniovi.ds.practica1.part1;

/**
 * Application.java
 *
 * @author willy
 * @version 201709151413
 * @since 201709151413
 * @formatter Oviedo Computing Community
 */
public class Application {

	public static void main(String[] args) {

		double[] temperaturas = new double[100];
		Temperature[] temperatures = new Temperature[100];

		// New data input
		for (int i = 0; i < temperaturas.length; i++)
			temperatures[i] = new Temperature(leeSensorCelsius());

		// Calculations with data in celsius.
		double mCelsius = 0;
		for (int i = 0; i < temperatures.length; i++)
			mCelsius += temperatures[i].asCelsius();
		mCelsius = mCelsius / temperatures.length;
		System.out.printf("La media en Celsius es: %.1f ºC\n", mCelsius);

		// Calculation with data in Farenheit
		double mFahrenheit = 0;
		for (int i = 0; i < temperatures.length; i++)
			mFahrenheit += temperatures[i].asFarenheit();
		mFahrenheit = mFahrenheit / temperatures.length;
		System.out.printf("La media en Fahrenheit es: %.1f ºF\n", mFahrenheit);

		// Another calculation with data in Fahrenheit
		double nVarianza = 0;
		for (int i = 0; i < temperatures.length; i++)
			nVarianza += Math.pow((temperatures[i].asFarenheit()) - mFahrenheit,
					2);
		nVarianza = nVarianza / temperatures.length;
		System.out.printf("La varianza en Fahrenheit es: %.1f\n", nVarianza);

		// *** OLD WAY ***

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++)
			temperaturas[i] = leeSensorCelsius();

		// Cálculo con los datos en Celsius
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaCelsius += temperaturas[i];
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.printf("La media en Celsius es: %.1f ºC\n", mediaCelsius);

		// Cálculo con los datos en Fahrenheit
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i] * 9 / 5 + 32;
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.printf("La media en Fahrenheit es: %.1f ºF\n",
				mediaFahrenheit);

		// Otro cálculo con los datos en Fahrenheit
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math
					.pow((temperaturas[i] * 9 / 5 + 32) - mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		System.out.printf("La varianza en Fahrenheit es: %.1f\n", varianza);
	}

	public static double leeSensorCelsius() {
		return Math.random() * 30;
	}
}