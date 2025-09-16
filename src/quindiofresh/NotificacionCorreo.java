package quindiofresh;

import interfaces.Notificacion;

public class NotificacionCorreo implements Notificacion{
	private String correo;

	public NotificacionCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando notificación por correo electrónico a: " + correo);
	}
}
