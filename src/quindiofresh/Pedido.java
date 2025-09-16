package quindiofresh;

import java.util.ArrayList;

public class Pedido {

	private String id;
	private String fechaCreacion;
	private Cliente cliente;
	private ArrayList<producto> productos;
	private String direccionEnvio;
	private String codigoDescuento;
	private String notasEspeciales;

	public Pedido (PedidoBuilder builder) {
		this.id = builder.id;
		this.fechaCreacion = builder.fechaCreacion;
		this.cliente = builder.cliente;
		this.productos = builder.productos;
		this.direccionEnvio = builder.direccionEnvio;
		this.notasEspeciales = builder.notasEspeciales;
		this.codigoDescuento = builder.codigoDescuento;
	}

	public String getId() {
		return id;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<producto> getProductos() {
		return productos;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public String getnotasEspeciales() {
		return notasEspeciales;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}
}
