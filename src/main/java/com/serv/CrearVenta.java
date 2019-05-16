/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serv;

import com.clases.Venta;
import com.dao.VentaDao;
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
@WebServlet(name = "CrearVenta", urlPatterns = {"/CrearVenta"})
public class CrearVenta extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double precio = Double.parseDouble(request.getParameter("pre"));
        BigDecimal no = BigDecimal.valueOf(precio);
        int cantidad = Integer.parseInt(request.getParameter("can"));
        double total = Double.parseDouble(request.getParameter("to"));
        BigDecimal ta = BigDecimal.valueOf(total);
        int cliente_id = Integer.parseInt(request.getParameter("cl"));
        int cafe_id = Integer.parseInt(request.getParameter("fe"));

        com.dao.VentaDao.add(new Venta(no, cantidad, ta, cliente_id, cafe_id));

        request.getRequestDispatcher("crear_venta.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
