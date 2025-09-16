package quindiofresh;

public class producto {

	private String SKU;
	private String  Nombre;
	private int Precio;

	public producto(String sKU, String nombre, int precio) {
		SKU = sKU;
		Nombre = nombre;
		Precio = precio;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}
}
