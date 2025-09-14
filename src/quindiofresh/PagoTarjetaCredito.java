package quindiofresh;

import interfaces.Pago;

public class PagoTarjetaCredito implements Pago{

	@Override
	public void procesar(Double monto) {
		System.out.print("pago por tarjeta de credito "+ monto);
		
	}
	
	

}
