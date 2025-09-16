package quindiofresh;

import java.util.ArrayList;

public class MiniMercado {
	private static MiniMercado instancia;
	private ArrayList<Producto> catalogo = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	private MiniMercado() {}

	public static MiniMercado getInstance() {
		if (instancia == null) {
			instancia = new MiniMercado();
		}
		return instancia;
	}

	public void agregarProducto(Producto p) {
		catalogo.add(p);
	}

	public ArrayList<Producto> getCatalogo() {
		return catalogo;
	}

	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
