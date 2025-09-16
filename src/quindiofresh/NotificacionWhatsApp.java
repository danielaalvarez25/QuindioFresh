package quindiofresh;

import interfaces.Notificacion;

public class NotificacionWhatsApp implements Notificacion{
	private String numeroTelefono;

	public NotificacionWhatsApp(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando notificación por WhatsApp al número:" + numeroTelefono);
	}
}
