package quindiofresh;

import java.util.ArrayList;

public class CatalogoProductos {

	private static CatalogoProductos instancia;

	private final ArrayList<producto> productos = new ArrayList<>();

	private CatalogoProductos() {}

	public static CatalogoProductos getInstance() {
		if (instancia == null) {
			instancia = new CatalogoProductos();
		}
		return instancia;
	}

	public void agregarProducto(producto producto) {
		productos.add(producto);
	}

	public producto buscarPorSku(int sku) {
		return productos.get(sku);
	}
}






