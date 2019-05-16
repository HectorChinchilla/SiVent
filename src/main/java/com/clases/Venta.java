/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author hector-chinchilla
 */
public class Venta {

    private int id;
    private LocalDate fecha;
    private BigDecimal precio;
    private int cantidad;
    private BigDecimal total;
    private int cliente_id;
    private int cafe_id;
    private String nombre_cliente;
    private String nombre_cafe;
    private String telefono;

    public Venta(int cantidad, BigDecimal total, String nombre_cliente, String nombre_cafe) {
        this.cantidad = cantidad;
        this.total = total;
        this.nombre_cliente = nombre_cliente;
        this.nombre_cafe = nombre_cafe;

    }

    public Venta(int id, Date fecha, BigDecimal precio, int cantidad, BigDecimal total, int cliente_id, int cafe_id) {
        this.id = id;
        this.fecha = fecha.toLocalDate();
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.cliente_id = cliente_id;
        this.cafe_id = cafe_id;
    }

    public Venta(BigDecimal precio, int cantidad, BigDecimal total, int cliente_id, int cafe_id) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.cliente_id = cliente_id;
        this.cafe_id = cafe_id;
    }

    public Venta(Date fecha, BigDecimal precio, int cantidad, BigDecimal total, int cliente_id, int cafe_id) {
        this.fecha = fecha.toLocalDate();
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.cliente_id = cliente_id;
        this.cafe_id = cafe_id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(int anio, int mes, int dia) {
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getCafe_id() {
        return cafe_id;
    }

    public void setCafe_id(int cafe_id) {
        this.cafe_id = cafe_id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_cafe() {
        return nombre_cafe;
    }

    public void setNombre_cafe(String nombre_cafe) {
        this.nombre_cafe = nombre_cafe;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
