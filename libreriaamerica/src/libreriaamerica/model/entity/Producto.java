package libreriaamerica.model.entity;

import java.math.BigDecimal;

public class Producto {
    
    private int idProducto;
    private String nombre;
    private String categoria;
    private BigDecimal precio;
    private int stock;
    private int stockMinimo;
    private int idProveedor; 
    private String descripcion;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String categoria, BigDecimal precio, int stock, int stockMinimo, int idProveedor, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    //Metodo para verificar si el stock es bajo
    public boolean esStockBajo(){
        return stock < stockMinimo;
    }
    
    
    
}

