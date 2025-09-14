package quindiofresh;

import interfaces.Pago;

public class PagoPSE implements Pago{

	@Override
	public void procesar(Double monto) {
		System.out.print("pago por PSE"+ monto);
		
		
	}
	

}
