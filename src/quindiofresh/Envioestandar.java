package quindiofresh;

import interfaces.Envio;

public class Envioestandar implements Envio{

	private final int costoEnvio = 7000;

	public void Enviar() {
		System.out.println("envio estandar su costo es de: " + costoEnvio);
	}
}
