package quindiofresh;

import java.util.ArrayList;

public class PedidoBuilder {
	 String id;
	 String fechaCreacion;
	 Cliente cliente;
	 ArrayList<producto> productos=new ArrayList<>();
	 String direccionEnvio;
	 String notasEspeciales;
	 String codigoDescuento;
	
	public PedidoBuilder id (String id) {
		this.id=id;
		return this;
	}
	public PedidoBuilder fechaCreacion (String fechaCreacion) {
		this.fechaCreacion=fechaCreacion;
		return this;
	}
	public PedidoBuilder Cliente (Cliente cliente) {
		this.cliente=cliente;
		return this;
	}
	
	public PedidoBuilder agregarProducto(producto producto) {
		this.productos.add(producto);
		return this;
		
	}
	public PedidoBuilder direccionEnvio(String direccionEnvio) {
		this.direccionEnvio=direccionEnvio;
		return this;
	}
	
	public PedidoBuilder notasEspeciales (String notasEspeciales) {
		this.notasEspeciales=notasEspeciales;
		return this;
	}
	
	public PedidoBuilder codigoDescuento (String codigoDescuento) {
		this.codigoDescuento=codigoDescuento;
		return this;
		
	}
	public Pedido build() {
		return new Pedido(this);
	}
}

	
	
		
	
	
	


