/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo4;

/**
 *
 * @author jjforond
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco implements ServicioClientes {
    private String nombreBanco;
    private String direccion;
    private String telefono;
    private List<Cliente> clientes;

    public Banco(String nombreBanco, String direccion, String telefono) {
        this.nombreBanco = nombreBanco;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        Collections.sort(clientes);
    }

    public void eliminarCliente(String nombre) {
        clientes.removeIf(cliente -> cliente.getNombre().equals(nombre));
    }

    public Cliente obtenerCliente(String nombre) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    // Métodos getters y setters
    // ...

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarCuenta(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cuenta buscarCuenta(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNombreBanco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object obtenerCuenta(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void ordenarClientesPorId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cerrarCuenta(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
