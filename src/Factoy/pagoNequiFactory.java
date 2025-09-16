package Factoy;

import interfaces.Pago;
import interfaces.pagoFactory;
import quindiofresh.PagoNequi;

public class pagoNequiFactory implements pagoFactory{
	
	private String Telefono;
	
	public pagoNequiFactory(String telefono) {
		Telefono = telefono;
	}
	
	@Override
	public Pago crearPago() {
		return new PagoNequi(Telefono);
	}
}
