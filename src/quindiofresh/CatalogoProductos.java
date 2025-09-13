package quindiofresh;


	public class CatalogoProductos {
	   
	    private static CatalogoProductos instancia;

	    private final <Producto> productos=new Arraylist<>();

	    private CatalogoProductos() {}

	    public static CatalogoProductos getInstance() {
	        if (instancia == null) {
	            instancia = new CatalogoProductos();
	        }
	        return instancia;
	    }

	    public void agregarProducto(Producto producto) {
	        productos.put(producto.getSku(), producto);
	    }

	    public Producto buscarPorSku(String sku) {
	        return productos.get(sku);
	    }

	    public Collection<Producto> getTodos() {
	        return productos.values();
	    }
	}






