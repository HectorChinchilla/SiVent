/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas;

import com.clases.Cliente;
import com.dao.ClienteDao;

/**
 *
 * @author hector-chinchilla
 */
public class ClientePrueba {

    public static void main(String args[]) {

        Cliente clien = new Cliente(1, "Marcos", "73154264", "Aldea Olopa");

        if (ClienteDao.add(clien)) {
            System.out.println("Query Ok");
        } else {
            System.out.println("no se pudo insertar el cliente");
        }
    }

}
