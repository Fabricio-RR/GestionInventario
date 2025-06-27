package libreriaamerica.model.entity;

import java.util.Date;

public class Respaldo {
    private int idRespaldo;
    private Date fecha;
    private String rutaArchivo;
    private String estado; 

    public Respaldo() {
    }

    public Respaldo(int idRespaldo, Date fecha, String rutaArchivo, String estado) {
        this.idRespaldo = idRespaldo;
        this.fecha = fecha;
        this.rutaArchivo = rutaArchivo;
        this.estado = estado;
    }

    public int getIdRespaldo() {
        return idRespaldo;
    }

    public void setIdRespaldo(int idRespaldo) {
        this.idRespaldo = idRespaldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
