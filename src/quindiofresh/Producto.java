package quindiofresh;

public class Producto {
    private String sku;
    private String nombre;
    private int precio;

    public Producto(String sku, String nombre, int precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (SKU: " + sku + ", $" + precio + ")";
    }
}
