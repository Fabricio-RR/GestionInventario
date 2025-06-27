package libreriaamerica.model.entity;

import java.util.Date;
import java.util.List;

public class Compra {
    private int idCompra;
    private Date fecha;
    private Usuario usuario;         
    private Proveedor proveedor;
    private double total;
    private String estado;           
    private List<DetalleCompra> detalles;

    public Compra() {
    }

    public Compra(int idCompra, Date fecha, Usuario usuario, Proveedor proveedor, double total, String estado, List<DetalleCompra> detalles) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.usuario = usuario;
        this.proveedor = proveedor;
        this.total = total;
        this.estado = estado;
        this.detalles = detalles;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleCompra> detalles) {
        this.detalles = detalles;
    }
    
}
