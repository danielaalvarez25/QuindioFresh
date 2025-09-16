package quindiofresh;

import interfaces.Pago;

public class PagoTarjetaCredito implements Pago{
	
	private String numeroTargeta;
		
	public PagoTarjetaCredito(String numeroTargeta) {
		this.numeroTargeta = numeroTargeta;
	}

	@Override
	public void procesar(Double monto) {
		System.out.print("pago por tarjeta de credito "+ monto + "numero de targeta: " + numeroTargeta);	
	}
}
