package modelo;
// Generated 18-abr-2020 20:41:47 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Compras generated by hbm2java
 */
public class Compras implements java.io.Serializable {

    private int idCompra;
    private Usuarios usuarios;
    private Date fecha;
    private Set reclamacioneses = new HashSet(0);

    private Set<LineasDeCompra> lineasDeCompras = new HashSet(0);

    public Compras() {
    }

    public Compras(int idCompra, Usuarios usuarios, Date fecha) {
        this.idCompra = idCompra;
        this.usuarios = usuarios;
        this.fecha = fecha;
    }

    public Compras(int idCompra, Usuarios usuarios, Date fecha, Set reclamacioneses, Set lineasDeCompras) {
        this.idCompra = idCompra;
        this.usuarios = usuarios;
        this.fecha = fecha;
        this.reclamacioneses = reclamacioneses;
        this.lineasDeCompras = lineasDeCompras;
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Usuarios getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set getReclamacioneses() {
        return this.reclamacioneses;
    }

    public void setReclamacioneses(Set reclamacioneses) {
        this.reclamacioneses = reclamacioneses;
    }

    public Set getLineasDeCompras() {
        return this.lineasDeCompras;
    }

    public void setLineasDeCompras(Set lineasDeCompras) {
        this.lineasDeCompras = lineasDeCompras;
    }

    public float getImporte() {
        float resultado = 0;
        for (LineasDeCompra ldc : this.lineasDeCompras) {
            resultado += ldc.getImporte();
        }

        return resultado;
    }

    public String compraToJson() {
        String salida = "{\"ID\":\"" + this.getIdCompra() + "\",\"Fecha\":\"" + this.getFecha() + "\",\"Importe\":\"" + this.getImporte() + "\"}";

        return salida;
    }

}
