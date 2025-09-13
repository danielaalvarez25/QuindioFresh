package quindiofresh;

public class PedidoBuilder {
	private String id;
	private String fechaCreacion;
	private Cliente cliente;
	private <Producto> productos=new Arraylist<>();
	private String direccionEnvio;
	private String notasEspeciales;
	private String codigoDescuento;
	
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
	
	public PedidoBuilder agregarProducto(Producto producto) {
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

	
	
		
	
	
	


