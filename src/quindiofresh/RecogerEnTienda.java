package quindiofresh;

import interfaces.Envio;

public class RecogerEnTienda implements Envio{
	
	private String Nombre;
	
	public RecogerEnTienda(String nombre) {
		super();
		Nombre = nombre;
	}

	@Override
	public void Enviar() {
		System.out.println("el pedido se recoge en la tienda esta a nombre de:" + Nombre );
	}
}
