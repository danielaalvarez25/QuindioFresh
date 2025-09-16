package quindiofresh;

import interfaces.Pago;

public class PagoPSE implements Pago{
	
	private String cuentaBancaria;
	
	public PagoPSE(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	@Override
	public void procesar(Double monto) {
		System.out.print("pago por PSE"+ monto + "cuenta bancaria: " + cuentaBancaria);	
	}
}
