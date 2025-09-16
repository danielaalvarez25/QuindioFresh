package Factoy;

import interfaces.Envio;
import interfaces.envioFactory;
import quindiofresh.Envioestandar;

public class envioEstandarFactory implements envioFactory{

	@Override
	public Envio crearEnvio() {
		return new Envioestandar();
	}
}
