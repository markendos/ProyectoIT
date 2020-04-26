package modelo;
// Generated 18-abr-2020 20:41:47 by Hibernate Tools 4.3.1



/**
 * LineasDeCompra generated by hbm2java
 */
public class LineasDeCompra implements java.io.Serializable {

    private LineasDeCompraId id;

    private Compras compras;

    private Productos productos;
    private int cantidad;

    public LineasDeCompra() {
    }

    public LineasDeCompra(LineasDeCompraId id, Compras compras, Productos productos, int cantidad) {
        this.id = id;
        this.compras = compras;
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public LineasDeCompraId getId() {
        return this.id;
    }

    public void setId(LineasDeCompraId id) {
        this.id = id;
    }

    public Compras getCompras() {
        return this.compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Productos getProductos() {
        return this.productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
