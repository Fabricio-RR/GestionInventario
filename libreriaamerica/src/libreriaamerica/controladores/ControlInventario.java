package libreriaamerica.controladores;

import java.util.List;
import libreriaamerica.dao.ProductoDAO;
import libreriaamerica.dao.ProveedorDAO;
import libreriaamerica.model.entity.Producto;
import libreriaamerica.model.entity.Proveedor;

public class ControlInventario {

    private final ProductoDAO productoDAO;
    private final ProveedorDAO proveedorDAO;

  
    public ControlInventario() {
        this.productoDAO = new ProductoDAO();
        this.proveedorDAO = new ProveedorDAO();
    }

    // REGISTRAR PRODUCTO
    public boolean registrarProducto(Producto p) {
        return productoDAO.insertarProducto(p);
    }

    // ACTUALIZAR PRODUCTO
    public boolean actualizarProducto(Producto p) {
        return productoDAO.actualizarProducto(p);
    }

    // ELIMINAR PRODUCTO
    public boolean eliminarProducto(int idProducto) {
        return productoDAO.eliminarProducto(idProducto);
    }

    // LISTAR TODOS LOS PRODUCTOS
    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }

    // BUSCAR PRODUCTO POR NOMBRE
    public Producto buscarProductoPorNombre(String nombre) {
        return productoDAO.buscarPorNombre(nombre);
    }

    // VERIFICAR STOCK BAJO
    public List<Producto> verificarStockBajo() {
        return productoDAO.verificarStockBajo();
    }

    // LISTAR TODOS LOS PROVEEDORES
    public List<Proveedor> listarProveedores() {
        return proveedorDAO.listarProveedores();
    }

    // REGISTRAR PROVEEDOR
    public boolean registrarProveedor(Proveedor proveedor) {
        return proveedorDAO.insertarProveedor(proveedor);
    }

    // ACTUALIZAR PROVEEDOR
    public boolean actualizarProveedor(Proveedor proveedor) {
        return proveedorDAO.actualizarProveedor(proveedor);
    }

    // ELIMINAR PROVEEDOR
    public boolean eliminarProveedor(int idProveedor) {
        return proveedorDAO.eliminarProveedor(idProveedor);
    }

    // BUSCAR PROVEEDOR POR NOMBRE
    public Proveedor buscarProveedorPorNombre(String nombre) {
        return proveedorDAO.buscarPorNombre(nombre);
    }
}
