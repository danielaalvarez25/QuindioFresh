package quindiofresh;

import java.util.List;

public class Pedido {
	
	private String id;
	private String fechaCreacion;
	private Cliente cliente;
	private List<producto> productos;
	private String direccionEnvio;
	private String codigoDescuento;
	private String notasEspeciales;
	
	
	private Pedido (pedidoBuilder builder) {
	this.id=builder.id;
	this.fechaCreacion=builder.fechaCreacion;
	this.cliente=builder.cliente;
	this.productos=builder.productos;
	this.direccionEnvio=builder.direccionEnvio;
	this.notasEspeciales=builder.notasEspeciales;
	this.codigoDescuento=builder.codigoDescuento;

	
public String getId() {
    return id;
}

public String getFechaCreacion() {
    return fechaCreacion;
}

public Cliente getCliente() {
    return cliente;
}

public List<Producto> getProductos() {
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
