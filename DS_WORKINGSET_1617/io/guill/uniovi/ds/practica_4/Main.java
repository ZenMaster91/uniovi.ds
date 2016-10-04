package io.guill.uniovi.ds.practica_4;


public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new CampoTexto("Nombre"));
		formulario.addCampo(new CampoTexto("Apellido"));
		formulario.addCampo(new CampoNumero("Tel�fono"));
		formulario.addCampo(new CampoPredefinido("Ciudad", "Santander", "Oviedo", "C�diz"));

		formulario.PideDatos();
	}
}
