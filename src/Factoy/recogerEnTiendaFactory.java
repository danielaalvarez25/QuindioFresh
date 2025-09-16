package Factoy;

import interfaces.Envio;
import interfaces.envioFactory;
import quindiofresh.RecogerEnTienda;

public class recogerEnTiendaFactory implements envioFactory {
	
	private String Nombre;
	
	public recogerEnTiendaFactory(String nombre) {
		Nombre = nombre;
	}

	@Override
	public Envio crearEnvio() {
		return new RecogerEnTienda(Nombre);
	}
}
