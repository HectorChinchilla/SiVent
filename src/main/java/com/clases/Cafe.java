/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

/**
 *
 * @author hector-chinchilla
 */
public class Cafe {

    private int id;
    private String nombre;

    public Cafe(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cafe(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
