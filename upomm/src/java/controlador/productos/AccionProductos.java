package controlador.productos;

import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import modelo.Productos;
import modelo.Valoraciones;

/**
 *
 * @author marwi
 */
public class AccionProductos extends ActionSupport {

    private List<Productos> productos = null;
    private Map<Integer, Float> puntuaciones;
    private int id;
    private Productos producto = null;

    public AccionProductos() {
        this.puntuaciones = new HashMap();
    }

    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String listar() {
        List<Productos> lp = modelo.DAO.ProductoDAO.listarProductos();
        if (lp != null && !lp.isEmpty()) {
            Iterator<Productos> it = lp.iterator();
            while (it.hasNext()) {
                int id = it.next().getIdProducto();
                List<Valoraciones> lv = modelo.DAO.ProductoDAO.obtenerValoracionesProducto(id);
                float puntuacion = 0;
                if (lv != null && !lv.isEmpty()) {
                    Iterator<Valoraciones> it2 = lv.iterator();
                    while (it2.hasNext()) {
                        puntuacion += it2.next().getPuntuacion();
                    }
                    puntuacion /= lv.size();
                }
                puntuaciones.put(id, puntuacion);
            }
        }
        setProductos(lp);
        return SUCCESS;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public Map getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(Map puntuaciones) {
        this.puntuaciones = puntuaciones;
    }

    public String seleccionarProducto() {

        String salida = ERROR;
        
        //La lista de productos al venir de una accion distinta es null, así que la búsqueda esta no funciona. He intentado ver si en el enlace se podían reenviar los parametros de la accion anterior pero no lo he conseguido, así que cargo de nuevo el producto de la BD con el id que si funciona. Dejo esto por si lo consigues sacar pero creo que por seguridad y por si hubiera algún cambio en el producto desde que se cargó la página principal hasta que accedes a él, es mejor hacer la consulta ad-hoc.
        /*if (productos != null) {
            int i = 0;
            while (i < productos.size() && salida.equals(ERROR)) {
                if (this.productos.get(i).getIdProducto() == this.id) {
                    this.producto = this.productos.get(i);
                    salida = SUCCESS;
                }
                i++;
            }
        }*/
        Productos p = modelo.DAO.ProductoDAO.obtenerProducto(id);
        if(p != null) {
            salida = SUCCESS;
        }
        return salida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }
}
