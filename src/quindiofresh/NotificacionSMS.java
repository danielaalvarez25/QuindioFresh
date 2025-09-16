package quindiofresh;

import interfaces.Notificacion;

public class NotificacionSMS implements Notificacion{
	   private String numeroTelefono;

   public NotificacionSMS(String numeroTelefono) {
	   this.numeroTelefono = numeroTelefono;
   }

   @Override
   public void enviarNotificacion() {
	   System.out.println("Enviando notificación por mensaje de texto al número:" + numeroTelefono);
   }
}
