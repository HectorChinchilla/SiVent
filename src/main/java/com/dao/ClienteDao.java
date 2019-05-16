/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Cliente;
import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hector-chinchilla
 */
public class ClienteDao {

    public static boolean add(Cliente cliente) {
        Connection con;
        PreparedStatement ps;
        String sql = "insert into cliente values(null,?,?,?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getDireccion());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;

        }
    }

    public static List<Cliente> clienteList() {
        List<Cliente> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from cliente";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("direccion")
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

    public static Cliente getById(int id) {

        Cliente cli;
        Connection con;

        PreparedStatement ps;
        String sql = "select * from cliente where id = ?";
        ResultSet rs;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            cli = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("direccion")
            );
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Error en la consulta:" + e.getMessage());
            cli = null;
        }

        return cli;
    }

    public static boolean update(Cliente cli) {

        Connection con;
        PreparedStatement ps;
        String sql = "update cliente set nombre = ?, telefono = ?, direccion = ? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(4, cli.getId());
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getTelefono());
            ps.setString(3, cli.getDireccion());
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
