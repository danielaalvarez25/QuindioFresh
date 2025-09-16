package quindiofresh;

import interfaces.Pago;

public class PagoNequi implements Pago {
	
	private String Telefono;
	
	public PagoNequi(String telefono) {
		Telefono = telefono;
	}
	
	@Override
	public void procesar(Double monto) {
		System.out.print("pago por Nequi "+ monto + "numero de telefono: " + Telefono);
	}
}
