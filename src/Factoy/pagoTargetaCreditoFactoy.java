package Factoy;

import interfaces.Pago;
import interfaces.pagoFactory;

public class pagoTargetaCreditoFactoy implements pagoFactory{
	
	private String numeroTargeta;
	
	public pagoTargetaCreditoFactoy(String numeroTargeta) {
		this.numeroTargeta = numeroTargeta;
	}

	@Override
	public Pago crearPago() {
		return new quindiofresh.PagoTarjetaCredito(numeroTargeta);
	}
}
