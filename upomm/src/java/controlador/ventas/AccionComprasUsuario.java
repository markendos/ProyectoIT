package controlador.ventas;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Map;
import modelo.Compras;
import modelo.Usuarios;

/**
 *
 * @author Amalio
 */
public class AccionComprasUsuario extends ActionSupport {

    private ArrayList<Compras> listaCompras = null;
    private Compras compra = null;
    private Integer idCompra = null;

    public String listarCompras() {
        String salida = SUCCESS;
        Map session = (Map) ActionContext.getContext().get("session");
        Usuarios user = (Usuarios) session.get("usuario");
        this.listaCompras = (ArrayList<Compras>) modelo.DAO.VentasDAO.listarCompras(user.getEmail());
        if (this.listaCompras.size() <= 0) {
            this.listaCompras = new ArrayList<>();
        }

        return salida;
    }

    public String seleccionarCompra() {
        String salida = ERROR;

        if (this.getIdCompra() != null) {
            Compras c = modelo.DAO.VentasDAO.obtenerCompra(this.getIdCompra());
            if (c != null) {
                this.setCompra(c);
                salida = SUCCESS;
            }
        }
        return salida;
    }

    public ArrayList<Compras> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Compras> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
}
