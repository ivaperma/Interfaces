package es.controlador;

import es.vista.VistaCalculadora;

public class Main {

	public static void main(String[] args) {
		
		VistaCalculadora miCalculadora = new VistaCalculadora();
		Controlador miControlador = new Controlador();
		miCalculadora.setControlador(miControlador);
		miControlador.setWindow(miCalculadora);

	}

}
