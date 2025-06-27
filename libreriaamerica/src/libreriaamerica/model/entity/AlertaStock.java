package libreriaamerica.model.entity;

import java.util.Date;

public class AlertaStock {
    private int idAlerta;
    private Producto producto;
    private Date fecha;
    private String tipo;      // Ejemplo: "STOCK_BAJO"
    private String mensaje;
    private boolean atendida;

    public AlertaStock() {
    }

    public AlertaStock(int idAlerta, Producto producto, Date fecha, String tipo, String mensaje, boolean atendida) {
        this.idAlerta = idAlerta;
        this.producto = producto;
        this.fecha = fecha;
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.atendida = atendida;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }
    
}
