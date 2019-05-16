/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas;

import com.clases.Cafe;
import com.dao.CafeDao;

/**
 *
 * @author hector-chinchilla
 */
public class CafePrueba {

    public static void main(String args[]) {

        Cafe cofi = new Cafe(1, "Catuai");

        if (CafeDao.add(cofi)) {
            System.out.println("Query Ok");
        } else {
            System.out.println("no se pudo insertar el cafe");
        }
    }

}
