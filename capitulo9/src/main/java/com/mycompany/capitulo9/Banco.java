/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo9;

/**
 *
 * @author jjforond
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Banco implements ServicioClientes, ServicioCuentas {
    private String nombreBanco;
    private String direccion;
    private String telefono;
    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public Banco(String nombreBanco, String direccion, String telefono) {
        this.nombreBanco = nombreBanco;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        clientes = clientes.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public void eliminarCliente(String nombre) {
        clientes = clientes.stream()
                .filter(cliente -> !cliente.getNombre().equals(nombre))
                .collect(Collectors.toList());
    }

    public Cliente obtenerCliente(String nombre) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        cuentas = cuentas.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public void cerrarCuenta(String numeroCuenta) {
        cuentas = cuentas.stream()
                .filter(cuenta -> !cuenta.getNumeroCuenta().equals(numeroCuenta))
                .collect(Collectors.toList());
    }

    public Cuenta obtenerCuenta(String numeroCuenta) {
        return cuentas.stream()
                .filter(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta))
                .findFirst()
                .orElse(null);
    }

    // Métodos getters y setters

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

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

    @Override
    public void depositar(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void retirar(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double consultarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

