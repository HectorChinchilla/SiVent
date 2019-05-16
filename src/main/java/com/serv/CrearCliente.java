/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serv;

import com.clases.Cafe;
import com.clases.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hector-chinchilla
 */
@WebServlet(name = "CrearCliente", urlPatterns = {"/CrearCliente"})
public class CrearCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nom = request.getParameter("nom");
        String tele = request.getParameter("tele");
        String dire = request.getParameter("dire");
        String contra = request.getParameter("contra");
        com.dao.ClienteDao.add(new Cliente(nom, tele, dire, contra));

        request.getRequestDispatcher("crear_cliente.jsp").forward(request, response);

    }

}
