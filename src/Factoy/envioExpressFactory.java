package Factoy;

import interfaces.Envio;
import interfaces.envioFactory;
import quindiofresh.EnvioExpress;

public class envioExpressFactory implements envioFactory{

	@Override
	public Envio crearEnvio() {
		return new EnvioExpress();
	}
}
