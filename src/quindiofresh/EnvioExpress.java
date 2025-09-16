package quindiofresh;

import interfaces.Envio;

public class EnvioExpress implements Envio {

	private final int costoEnvio = 15000;

	public void Enviar() {
		System.out.println("envio express, su costo es de: " + costoEnvio);
	}
}
