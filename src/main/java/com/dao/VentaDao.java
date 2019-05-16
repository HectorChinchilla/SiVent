/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Venta;
import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hector-chinchilla
 */
public class VentaDao {

    public static boolean add(Venta ven) {
        Connection con;
        PreparedStatement ps;

        LocalDate b = LocalDate.now();
        Date d = Date.valueOf(b);
        String sql = "insert into venta values(null,?,?,?,?,?,?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setDate(1, d);
            ps.setBigDecimal(2, ven.getPrecio());
            ps.setInt(3, ven.getCantidad());
            ps.setBigDecimal(4, ven.getTotal());
            ps.setInt(5, ven.getCliente_id());
            ps.setInt(6, ven.getCafe_id());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;

        }
    }

    public static List<Venta> ventaList() {
        List<Venta> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select cliente.nombre, cafe.nombre, venta.cantidad, venta.total from cliente, venta, cafe where cliente.id = venta.cliente_id and cafe.id = venta.cafe_id;";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Venta(
                        rs.getInt("venta.cantidad"),
                        rs.getBigDecimal("venta.total"),
                        rs.getString("cliente.nombre"),
                        rs.getString("cafe.nombre")
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en la lista: " + e);
            list.clear();
        }

        return list;
    }

    public static Venta getById(int id) {

        Venta ve;
        Connection con;

        PreparedStatement ps;
        String sql = "select venta.id, venta.precio,venta.cantidad,venta.total,cafe.nombre,cliente.nombre"
                + " from "
                + "cafe, venta, cliente "
                + "where cafe.id= venta.cafe_id and cliente.id = venta.cliente_id;";
        ResultSet rs;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            ve = new Venta(
                    rs.getBigDecimal("precio"),
                    rs.getInt("cantidad"),
                    rs.getBigDecimal("total"),
                    rs.getInt("cafe.nombre"),
                    rs.getInt("cliente.nombre")
            );
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Error en la consulta:" + e.getMessage());
            ve = null;
        }

        return ve;
    }

    public static boolean update(Venta ve) {

        Connection con;
        PreparedStatement ps;
        String sql = "update venta set precio = ?, cantidad = ?, total = ?, cafe.nombre = ?, cliente.nombre = ? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(6, ve.getId());
            ps.setBigDecimal(2, ve.getPrecio());
            ps.setInt(2, ve.getCantidad());
            ps.setBigDecimal(3, ve.getTotal());
            ps.setString(4, ve.getNombre_cafe());
            ps.setString(5, ve.getNombre_cliente());
            rowAffected = ps.executeUpdate();
            ps.close();
            con.close();
            return rowAffected == 1;

        } catch (SQLException e) {
            System.out.println("Error en la consulta:" + e.getMessage());
            return false;
        }

    }

}
