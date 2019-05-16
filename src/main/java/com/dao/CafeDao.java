/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.clases.Cafe;
import com.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hector-chinchilla
 */
public class CafeDao {

    public static boolean add(Cafe cofi) {
        Connection con;
        PreparedStatement ps;

        java.util.Date ahora = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String sql = "insert into cafe values(null,?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cofi.getNombre());
            ps.executeUpdate();
            sdf.format(ahora);
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;

        }
    }

    public static List<Cafe> cofList() {
        List<Cafe> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from cafe";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Cafe(
                        rs.getInt("id"),
                        rs.getString("nombre")
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

    public static Cafe getById(int id) {

        Cafe c;
        Connection con;

        PreparedStatement ps;
        String sql = "select * from cafe where id = ?";
        ResultSet rs;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            c = new Cafe(
                    rs.getInt("id"),
                    rs.getString("nombre")
            );
            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Error en la consulta:" + e.getMessage());
            c = null;
        }

        return c;
    }

    public static boolean update(Cafe ca) {

        Connection con;
        PreparedStatement ps;
        String sql = "update cafe set nombre = ? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(2, ca.getId());
            ps.setString(1, ca.getNombre());
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
