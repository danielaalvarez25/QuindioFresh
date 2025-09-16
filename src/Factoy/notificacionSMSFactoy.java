package Factoy;

import interfaces.Notificacion;
import interfaces.notificacionFactoy;
import quindiofresh.NotificacionSMS;

public class notificacionSMSFactoy implements notificacionFactoy{
	private String Telefono;

	public notificacionSMSFactoy(String telefono) {
		super();
		Telefono = telefono;
	}

	@Override
	public Notificacion crearNotificacion() {
		return new NotificacionSMS(Telefono);
	}
}
