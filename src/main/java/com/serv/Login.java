/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serv;

import com.clases.Cliente;
import com.dao.ClienteDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hector-chinchilla
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession isAuthenticated = request.getSession();
        
        String usua = request.getParameter("us");
        String contra = request.getParameter("co");
        
      /**    Cliente uno;
        uno = (Cliente) ClienteDao.getCliente(usua);
        
        if(uno == null){
            isAuthenticated.setAttribute("valor",false);
            request.getRequestDispatcher("no_existe.jsp").forward(request, response);
        }else if (!contra.equals(uno.getPassword())){
            isAuthenticated.setAttribute("valor",false);
            request.getRequestDispatcher("no_existe.jsp").forward(request, response);
        }else if (contra.equals(uno.getPassword())){
            isAuthenticated.setAttribute("valor",true);
            request.getRequestDispatcher("user/home.jsp").forward(request, response);
        }
    }

     */

    }
}
