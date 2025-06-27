package libreriaamerica.model.entity;

import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private Usuario usuario;      
    private double total;
    private List<DetalleVenta> detalles;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, Usuario usuario, double total, List<DetalleVenta> detalles) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.usuario = usuario;
        this.total = total;
        this.detalles = detalles;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
    
}
