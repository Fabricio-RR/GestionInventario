/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.ConnectionDB;
import entidades.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class ProductoDAO {

    // INSERTAR NUEVO PRODUCTO
    public boolean insertarProducto(Producto producto) {
        String sql = "INSERT INTO producto (nombre, categoria, precio, stock, stock_minimo, id_proveedor, descripcion) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConnectionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getCategoria());
            stmt.setBigDecimal(3, producto.getPrecio());
            stmt.setInt(4, producto.getStock());
            stmt.setInt(5, producto.getStockMinimo());
            stmt.setInt(6, producto.getIdProveedor());
            stmt.setString(7, producto.getDescripcion());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
            return false;
        }
    }

    // LISTAR TODOS LOS PRODUCTOS
    public List<Producto> listarProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";

        try (Connection con = ConnectionDB.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("id_producto"));
                p.setNombre(rs.getString("nombre"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getBigDecimal("precio"));
                p.setStock(rs.getInt("stock"));
                p.setStockMinimo(rs.getInt("stock_minimo"));
                p.setIdProveedor(rs.getInt("id_proveedor"));
                p.setDescripcion(rs.getString("descripcion"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }

        return lista;
    }

    // BUSCAR PRODUCTO POR NOMBRE
    public Producto buscarPorNombre(String nombre) {
        String sql = "SELECT * FROM producto WHERE nombre LIKE ?";
        Producto p = null;

        try (Connection con = ConnectionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, "%" + nombre + "%");

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                p = new Producto();
                p.setIdProducto(rs.getInt("id_producto"));
                p.setNombre(rs.getString("nombre"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getBigDecimal("precio"));
                p.setStock(rs.getInt("stock"));
                p.setStockMinimo(rs.getInt("stock_minimo"));
                p.setIdProveedor(rs.getInt("id_proveedor"));
                p.setDescripcion(rs.getString("descripcion"));
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }

        return p;
    }

    // ACTUALIZAR PRODUCTO
    public boolean actualizarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, categoria=?, precio=?, stock=?, stock_minimo=?, id_proveedor=?, descripcion=? WHERE id_producto=?";

        try (Connection con = ConnectionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getCategoria());
            stmt.setBigDecimal(3, producto.getPrecio());
            stmt.setInt(4, producto.getStock());
            stmt.setInt(5, producto.getStockMinimo());
            stmt.setInt(6, producto.getIdProveedor());
            stmt.setString(7, producto.getDescripcion());
            stmt.setInt(8, producto.getIdProducto());

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
            return false;
        }
    }

    // ELIMINAR PRODUCTO
    public boolean eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE id_producto = ?";

        try (Connection con = ConnectionDB.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idProducto);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
            return false;
        }
    }

    // VERIFICAR STOCK BAJO
    public List<Producto> verificarStockBajo() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE stock < stock_minimo";

        try (Connection con = ConnectionDB.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("id_producto"));
                p.setNombre(rs.getString("nombre"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getBigDecimal("precio"));
                p.setStock(rs.getInt("stock"));
                p.setStockMinimo(rs.getInt("stock_minimo"));
                p.setIdProveedor(rs.getInt("id_proveedor"));
                p.setDescripcion(rs.getString("descripcion"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al verificar stock bajo: " + e.getMessage());
        }

        return lista;
    }
}
