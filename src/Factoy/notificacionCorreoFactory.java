package Factoy;

import interfaces.Notificacion;
import interfaces.notificacionFactoy;
import quindiofresh.NotificacionCorreo;

public class notificacionCorreoFactory implements notificacionFactoy{
	
	private String correo;

	public notificacionCorreoFactory(String correo) {
		this.correo = correo;
	}

	@Override
	public Notificacion crearNotificacion() {
		return new NotificacionCorreo(correo);
	}
}
