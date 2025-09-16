package quindiofresh;

import java.util.ArrayList;

public class CatalogoProductos {

	private static CatalogoProductos instancia;

	private final ArrayList<Producto> productos = new ArrayList<>();

	private CatalogoProductos() {}

	public static CatalogoProductos getInstance() {
		if (instancia == null) {
			instancia = new CatalogoProductos();
		}
		return instancia;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public Producto buscarPorSku(int sku) {
		return productos.get(sku);
	}
}






