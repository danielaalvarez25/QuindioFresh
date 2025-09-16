package Factoy;

import interfaces.Notificacion;
import interfaces.notificacionFactoy;
import quindiofresh.NotificacionWhatsApp;

public class notificacionWhasAppFactoy implements notificacionFactoy{
	private String Telefono;

	public notificacionWhasAppFactoy(String telefono) {
		super();
		Telefono = telefono;
	}

	@Override
	public Notificacion crearNotificacion() {
		return new NotificacionWhatsApp(Telefono);
	}
}
