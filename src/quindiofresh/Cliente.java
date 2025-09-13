package quindiofresh;

public class Cliente {

		private String nombre;
		private String email;
		private String teléfono;
		
		public Cliente(String nombre, String email, String teléfono) {
			this.nombre = nombre;
			this.email = email;
			this.teléfono = teléfono;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTeléfono() {
			return teléfono;
		}

		public void setTeléfono(String teléfono) {
			this.teléfono = teléfono;
		}
	}



