/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.ProductoDAO;
import dao.ProveedorDAO;
import entidades.Producto;
import entidades.Proveedor;

import java.util.List;

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
