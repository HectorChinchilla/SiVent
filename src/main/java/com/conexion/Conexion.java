/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hector-chinchilla
 */
public class Conexion {

    private static Connection con;
    private static String stringConexion;
    private static boolean conected = false;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            stringConexion = "jdbc:mysql://localhost:3306/registro?allowPublicKeyRetrieval=true&useSSL=false";

            con = DriverManager.getConnection(stringConexion, "root", "admin1234");
            conected = true;
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexion: " + ex.getMessage());
            return null;
        }

    }

    public static void close() throws SQLException {
        if (conected == true) {
            con.close();
        }
    }
}
