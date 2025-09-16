package Factoy;

import interfaces.Pago;
import interfaces.pagoFactory;
import quindiofresh.PagoPSE;

public class pagoPSEFactory implements pagoFactory{
	
	private String cuentaBancaria;
	
	public pagoPSEFactory(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	@Override
	public Pago crearPago() {
		return new PagoPSE(cuentaBancaria);
	}
}
