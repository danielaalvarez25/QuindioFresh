package quindiofresh;

import interfaces.Pago;

public class PagoFactory {
	
public static Pago crearPago(String tipo) {
	
 if (tipo.equalsIgnoreCase("targeta"));{
	 return new PagoTarjetaCredito();
 }  else if (tipo.equalsIgnoreCase("PSE")) {
return new PagoPSE();
 }

return null;
 		
}
}
